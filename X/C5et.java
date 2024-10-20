package X;

/* renamed from: X.5et, reason: invalid class name */
/* loaded from: 5et.class */
public enum C5et {
    CAPTURE("Capture"),
    COLOR_CANVAS("ColorCanvas"),
    EDIT("Edit"),
    PICK("Pick"),
    FORWARD("Forward"),
    UNSPECIFIED("Unspecified"),
    CUSTOM_IMAGE("CustomImage");

    public String analyticsName;

    C5et(String str) {
        this.analyticsName = str;
    }
}
