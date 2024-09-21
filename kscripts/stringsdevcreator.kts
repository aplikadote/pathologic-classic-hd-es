import org.w3c.dom.Document
import org.w3c.dom.Element
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult
import kotlin.system.exitProcess

var filenameProd = args[0]
var filenameDev = args[1]

val fileProd = File(filenameProd);
if (!fileProd.exists()) {
    println("Error: Archivo '$filenameProd' no encontrado")
    exitProcess(0)
}

val fileDev = File(filenameDev)
if (!fileDev.parentFile.exists()) {
    fileDev.parentFile.mkdir()
    exitProcess(0)
}

val xmlDoc = read(fileProd)
write(xmlDoc, fileDev)

fun read(file: File): Document {
    val builderFactory = DocumentBuilderFactory.newInstance()
    val docBuilder = builderFactory.newDocumentBuilder()
    return docBuilder.parse(file)
}

fun write(xmlDoc: Document, outputFile: File) {
    val mainNode = xmlDoc.getElementsByTagName("strings").item(0) as Element
    val keyList = mainNode.getElementsByTagName("string")
    for (i in 0..<keyList.length) {
        val item = keyList.item(i) as Element
        val id = item.getAttribute("id")
        val aux = item.firstChild.nodeValue
        val content = "$aux ($id)"
        item.firstChild.textContent = content;
    }

    val transformer = TransformerFactory.newInstance().newTransformer()
    transformer.transform(DOMSource(xmlDoc), StreamResult(outputFile))
    println("'$filenameDev' Created.")
}

