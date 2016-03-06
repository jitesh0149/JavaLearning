package examples.equals;

public class EqualHashCodeImpl {

    Integer userId;
    String userFirstName;
    String userLastName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + (this.userId != null ? this.userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        //-----------------------------------------------------------------------
        //------------- final is not mandatory
        //------------- object to converted to the original class 
        final EqualHashCodeImpl other = (EqualHashCodeImpl) obj;
        if (this.userId != other.userId && (this.userId == null || !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

}
