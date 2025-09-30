## Implementierung
Die ProductData Klasse wurde anhand des gegebenen Beispiels erstellt.
Mehr Attribute wurden der WarehouseData Klasse hinzugefügt.

Anhand des vorhandenen JSON Code-Beispiels habe ich im WarehouseController den XML-Teil ähnlich gestaltet

Damit die Erstellung von XML funktioniert braucht man folgende Dependency

````groovy
dependencies {
    implementation ('jakarta.xml.bind:jakarta.xml.bind-api:3.0.1')
}
````
Mit dieser Dependency muss man die Eigenschaften des XMLs sozusagen markieren
```java
@XmlRootElement(name = "WarehouseData")
@XmlAccessorType(XmlAccessType.FIELD)
public class WarehouseData {
    
}
```
Hier wird die XmlRootElement verwendet, um den Root des XMLs bekannt zu geben
XmlAccessorType wird benötigt um die Attribute im XML-Mapping verwenden zu können

```java
@XmlElementWrapper(name = "productData")
	@XmlElement(name = "product")
	private List<ProductData> productData;
```
Hier wird die Liste von ProductDaten als XmlElementWrapper annotiert, somit wird gesagt, dass die Elemente in dieser Liste
in der XML unter productData stehen
XmlElement, beschreibt, dass jedes Element in der Liste als <product> im XML dargestellt wird


## Probleme

Bei Ausführung nach der Implementierung von XML wurde ein Error 500 ausgegeben.
Erst nach einem Neustart des PCs hat es wieder korrekt funktioniert
