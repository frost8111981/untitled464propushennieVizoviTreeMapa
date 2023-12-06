package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class MissedCall {
    Map<LocalDateTime, String> missedCallMap;

    public MissedCall() {
        missedCallMap = new TreeMap<>();
    }

    public void addMissedCall(String phone){
        LocalDateTime currentTime = LocalDateTime.now();
        missedCallMap.put(currentTime,phone);
    }

    public String getMissedCalls() {
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss yyyy-MM-dd");
        for (Map.Entry<LocalDateTime, String> entry : missedCallMap.entrySet()) {
            LocalDateTime dateTime = entry.getKey();
            String formattedDateTime = dateTime.format(formatter);
            String phone = entry.getValue();
            sb.append(formattedDateTime).append(" ").append(phone).append("\n");
        }
        return sb.toString();
    }

    public void clearMissedCalls() {
        missedCallMap.clear();
    }


}
