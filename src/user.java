public class user {
    private String fname;
    private String lname;
    private int pin;

    public user(String fname, String lname, int pin) {
        this.fname = fname;
        this.lname = lname;
        this.pin = pin;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String greater() {
        String a = getLname();
        String b = getFname();
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }

    public String smaller() {
        String a = getLname();
        String b = getFname();
        if (b.compareTo(a) > 0) {
            return a;
        } else {
            return b;
        }
    }

    public int greaterlengthint() {
        String c = greater();
        int n = c.length();
        return n;
    }

    public String pintraversforward() {
        String a = String.valueOf(getPin());
        int l = a.length();
        int n = greaterlengthint();
        if (n > l) {
            String b = a.substring(l - 2, l - 1);
            return b;
        } else {
            String c = a.substring(0, n);
            return c;
        }
    }

    public String reverse() {
        StringBuilder sb = new StringBuilder(getPin());
        StringBuilder a = sb.reverse();
        String c = smaller();
        int b = c.length();
        int l = a.length();
        if (b > l) {
            String k = a.substring(0);
            return k;
        } else {
            String m = a.substring(0, b);
            return m;
        }

    }

    public String s() {
        return greater() + smaller() + pintraversforward() + reverse();
    }
}



