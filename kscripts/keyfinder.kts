import org.w3c.dom.Document
import org.w3c.dom.Element
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory
import kotlin.system.exitProcess

if (args.isEmpty()) {
    println("Ingrese id")
    exitProcess(0)
}

var idToFind = args[0].toInt()
var filenameEs = args[1]
var filenameEn = args[2]

val filePathologicStrings = File(filenameEs);
val filePathologicStringsEn = File(filenameEn)

if (!filePathologicStrings.exists()) {
    println("Error: Archivo '$filenameEs' no encontrado")
    exitProcess(0)
}

if (!filePathologicStringsEn.exists()) {
    println("Error: Archivo '$filenameEn' no encontrado")
    exitProcess(0)
}

val xmlDoc = read(filePathologicStrings)
val xmlDocEn = read(filePathologicStringsEn)

val itemFound = find(xmlDoc, idToFind)
if (itemFound != null) {
    val itemFoundEn = find(xmlDocEn, idToFind)
    val key = itemFound.firstChild.nodeValue
    val keyEn = itemFoundEn?.firstChild?.nodeValue
    println("Es: $key")
    println("En: $keyEn")
} else {
    println("Id no encontrado")
}

fun read(file: File): Document {
    val builderFactory = DocumentBuilderFactory.newInstance()
    val docBuilder = builderFactory.newDocumentBuilder()
    return docBuilder.parse(file)
}

fun find(xmlDoc: Document, idToFind: Int): Element? {
    val keys = xmlDoc.getElementsByTagName("string")

    var itemFound: Element? = null
    for (i in 0..<keys.length) {
        val item = keys.item(i) as Element
        val id = item.getAttribute("id").toInt()
        if (id == idToFind) {
            itemFound = item
            break
        }
    }
    return itemFound
}
