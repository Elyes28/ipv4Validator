import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ipv4ValidatorTest {

    @Test
    public void testValidIpv4Address() {
        assertTrue(ipv4Validator.ValidateIpv4Address("192.168.1.1"));
        assertTrue(ipv4Validator.ValidateIpv4Address("10.0.0.1"));
        assertTrue(ipv4Validator.ValidateIpv4Address("127.0.0.1"));
    }

    @Test
    public void testInvalidIpv4Address() {
        assertFalse(ipv4Validator.ValidateIpv4Address("0.0.0.0"));
        assertFalse(ipv4Validator.ValidateIpv4Address("255.255.255.255"));
        assertFalse(ipv4Validator.ValidateIpv4Address("1.1.1.0"));
        assertFalse(ipv4Validator.ValidateIpv4Address("10.0.1"));
    }


}