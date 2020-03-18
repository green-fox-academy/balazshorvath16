public class ToBeReversed {


    public static void main(String[] args) {

        String toBeReversed = "  \n" +
                "nohtyP fo neZ ehT\n" +
                "sreteP miT yb\n" +
                "\n" +
                ".ylgu naht retteb si lufituaeB\n" +
                ".ticilpmi naht retteb si ticilpxE\n" +
                ".xelpmoc naht retteb si elpmiS\n" +
                ".detacilpmoc naht retteb si xelpmoC\n" +
                ".detsen naht retteb si talF\n" +
                ".esned naht retteb si esrapS\n" +
                ".stnuoc ytilibadaeR\n" +
                ".selur eht kaerb ot hguone laiceps t'nera sesac laicepS\n" +
                ".ytirup staeb ytilacitcarp hguohtlA\n" +
                ".yltnelis ssap reven dluohs srorrE\n" +
                ".decnelis ylticilpxe sselnU\n" +
                ".sseug ot noitatpmet eht esufer ,ytiugibma fo ecaf eht nI\n" +
                ".ti od ot yaw suoivbo-- eno ylno ylbareferp dna --eno eb dluohs erehT\n" +
                ".hctuD er'uoy sselnu tsrif ta suoivbo eb ton yam yaw taht hguohtlA\n" +
                ".reven naht retteb si woN\n" +
                ".won *thgir* naht retteb netfo si reven hguohtlA\n" +
                ".aedi dab a s'ti ,nialpxe ot drah si noitatnemelpmi eht fI\n" +
                ".aedi doog a eb yam ti ,nialpxe ot ysae si noitatnemelpmi eht fI\n" +
                "!esoht fo erom od s'tel -- aedi taerg gniknoh eno era secapsemaN\n";

        String reversed = "";
        for (int i = toBeReversed.length() -1; i>=0; i--) {
            reversed = reversed + toBeReversed.charAt(i);


        }
        System.out.println(reversed);

    }
}
