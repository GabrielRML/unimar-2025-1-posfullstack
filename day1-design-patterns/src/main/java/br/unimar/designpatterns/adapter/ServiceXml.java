package br.unimar.designpatterns.adapter;

/**
 * Adaptee with an incompatible interface.
 */
public class ServiceXml {
    public String getUserDataXml() {
        return """
                <xml>
                    <id>1</id>
                    <name>Venilton</name>
                    <age>36</age>
                </xml>
                """;
    }
}