package ir.digipay.bulkshop.api;

public class CustomerModel {

    private String id;
    private String username;
    private String firstName;
    private String lastName;

    public CustomerModel(String id, String username, String firstName, String lastName) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public CustomerModel() {
    }

    public static CustomerModelBuilder builder() {
        return new CustomerModelBuilder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static class CustomerModelBuilder {

        private String id;
        private String username;
        private String firstName;
        private String lastName;

        CustomerModelBuilder() {
        }

        public CustomerModel.CustomerModelBuilder id(String id) {
            this.id = id;
            return this;
        }

        public CustomerModel.CustomerModelBuilder username(String username) {
            this.username = username;
            return this;
        }

        public CustomerModel.CustomerModelBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public CustomerModel.CustomerModelBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public CustomerModel build() {
            return new CustomerModel(id, username, firstName, lastName);
        }

    }
}
