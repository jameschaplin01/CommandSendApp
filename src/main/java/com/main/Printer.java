package com.main;

public class Printer {

    /**
     *
     */

    // Actions
    public String powerOn = "^0!PO";
    public String powerOff = "^0!PF";
    public String startPrintReady = "^0!GO";
    public String stopPrintReady = "^0!ST";
    public String closeNozzle = "^0!NC";
    public String openNozzle = "^0!NO";
    public String resetCounter = "^0!RC";
    public String flushFifo = "^0!FF";

    // Inquiries
    public String externalStates = "^0?EX";
    public String serviceHistory = "^0?SH";
    public String hydraulicState = "^0?HS";
    public String mainConfiguration = "^0?MC";
    public String currentCounter = "^0?CC";
    public String errorList = "^0?EL";
    public String currentViscosity = "^0?SV";

    // Parameter transfer
    public String setViscoValue = "^0=SV";

    public void setSetViscoValue() {


    }
}
