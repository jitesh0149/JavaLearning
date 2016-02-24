package examples.interfaces;

public interface RainbowColors extends BaseColors {

    int YELLOW = 3, ORANGE = 5, INDIGO = 6, VIOLET = 7, GREEN = 3;

    public void RainbowColorMethod();

    @Override
    public void BaseColorMethod2();
    // default methods & static interface methods are supported from JAVA 8
    //    public static void jitesh(){
    //        System.out.println("Test");
    //    }
    //  
    //        
    //    default ZonedDateTime getZonedDateTime(String zoneString) {
    //        return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneString));
    //    }
}
