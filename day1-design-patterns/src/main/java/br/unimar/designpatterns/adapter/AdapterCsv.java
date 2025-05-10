package br.unimar.designpatterns.adapter;

/**
 * Adapter makes {@link ServiceCsv} compatible with {@link Service} (target).
 */
public class AdapterCsv implements Service {

    private final ServiceCsv serviceCsv;

    public AdapterCsv(ServiceCsv serviceCsv) {
        this.serviceCsv = serviceCsv;
    }

    @Override
    public User getUser() {
        String[] userDataParts = serviceCsv.getUserDataCsv().split(",");

        int userId = Integer.parseInt(userDataParts[0]);
        String userName = userDataParts[1];
        int userAge = Integer.parseInt(userDataParts[2]);

        return new User(userId, userName, userAge);
    }
}