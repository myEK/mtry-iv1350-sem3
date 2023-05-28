package mtry.se.iv1350.sem3.model.dto;

/**
 * User Information
 * 
 * @author mtrys
 */
public class UserDTO {
    private final String name;

    /**
     * set the name of the costermer
     * 
     * @param name
     */
    public UserDTO(String name) {
        this.name = name;
    }

    /**
     * 
     * @return return the name of the custemer
     */
    public String getName() {
        return this.name;
    }

}
