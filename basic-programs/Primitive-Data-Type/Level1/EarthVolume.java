class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;

        
        double volumeKm = (4.0 / 3.0) * 3.14 * radiusKm * radiusKm * radiusKm;

        double volumeMiles = volumeKm * 0.239913;

        System.out.println(
            "The volume of earth in cubic kilometers is " + volumeKm +
            " and cubic miles is " + volumeMiles
        );
    }
}
