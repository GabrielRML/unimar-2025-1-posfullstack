package br.unimar.designpatterns.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdapterTest {

    @Test
    void testAdapterCsv() {
        // Arrange
        ServiceCsv serviceCsv = new ServiceCsv();
        Service adapterCsv = new AdapterCsv(serviceCsv);
        Client client = new Client();

        // Act
        Service.User user = client.doWork(adapterCsv);

        // Assert
        assertEquals(1, user.id());
        assertEquals("Venilton", user.name());
        assertEquals(36, user.age());
    }

    @Test
    void testAdapterXml() {
        // Arrange
        ServiceXml serviceXml = new ServiceXml();
        Service adapterXml = new AdapterXml(serviceXml);
        Client client = new Client();

        // Act
        Service.User user = client.doWork(adapterXml);

        // Assert
        assertEquals(1, user.id());
        assertEquals("Venilton", user.name());
        assertEquals(36, user.age());
    }
}