package br.unimar.designpatterns.adapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Adapter makes {@link ServiceCsv} compatible with {@link Service} (target).
 */
public class AdapterXml implements Service {

    private final ServiceXml serviceXml;

    public AdapterXml(ServiceXml serviceXml) {
        this.serviceXml = serviceXml;
    }

    @Override
    public User getUser() {
        String xml = serviceXml.getUserDataXml();

        int userId = Integer.parseInt(extractGroup(xml, "<id>(\\d+)</id>"));
        String userName = extractGroup(xml, "<name>([^<]+)</name>");
        int userAge = Integer.parseInt(extractGroup(xml, "<age>(\\d+)</age>"));

        return new User(userId, userName, userAge);
    }

    private String extractGroup(String xml, String regex) {
        Matcher matcher = Pattern.compile(regex).matcher(xml);
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Value not found for regex: " + regex);
    }
}