public class ipv4Validator {
    public static boolean ValidateIpv4Address(String ipAddress) {
        // Check if the IP address consists of 4 one-byte blocks separated by dots
        String[] blocks = ipAddress.split("\\.");
        if (blocks.length != 4) {
            return false;
        }

        // Check if each block is a valid integer between 0 and 255
        for (String block : blocks) {
            if (!block.matches("\\d+")) {
                return false;
            }
            int value = Integer.parseInt(block);
            if (value < 0 || value > 255) {
                return false;
            }
        }

        // Check if the IP address is not a network segment or broadcast address
        if (ipAddress.endsWith(".0") || ipAddress.endsWith(".255")) {
            return false;
        }

        // All checks passed, the IP address is valid
        return true;
    }
}
