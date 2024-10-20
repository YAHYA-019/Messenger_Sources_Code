package X;

/* renamed from: X.4sg, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4sg.class */
public final class C10114sg {
    public final Long A00;
    public final Long A01;
    public final Long A02;
    public final String A03;

    public C10114sg(InterfaceC10094se interfaceC10094se, String str) {
        this.A03 = str;
        long[] itemInformation = interfaceC10094se.getItemInformation(str);
        this.A02 = Long.valueOf(itemInformation[0]);
        this.A01 = Long.valueOf(itemInformation[1]);
        this.A00 = Long.valueOf(itemInformation[2]);
    }
}
