package X;

/* renamed from: X.0zn, reason: invalid class name */
/* loaded from: 0zn.class */
public abstract class C0zn {
    public static final C04t A00;

    static {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append('(');
        A0k.append("(\\p{Digit}+)");
        A0k.append("(\\.)?(");
        A0k.append("(\\p{Digit}+)");
        A0k.append("?)(");
        A0k.append("[eE][+-]?(\\p{Digit}+)");
        A0k.append(")?)|(\\.(");
        A0k.append("(\\p{Digit}+)");
        A0k.append(")(");
        A0k.append("[eE][+-]?(\\p{Digit}+)");
        A0k.append(")?)|((");
        A0k.append("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))");
        A0k.append(")[pP][+-]?");
        A0k.append("(\\p{Digit}+)");
        A00 = new C04t(0Pz.A0j("[\\x00-\\x20]*[+-]?(NaN|Infinity|((", AnonymousClass001.A0g(A0k, ')'), ")[fFdD]?))[\\x00-\\x20]*"));
    }
}
