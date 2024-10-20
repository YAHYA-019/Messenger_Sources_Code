package X;

import com.facebook.messaging.wellbeing.plugins.ixt.mutethread.MSGBloksIXTMuteThreadImplementation;

/* loaded from: Cne.class */
public final class Cne implements DFT {
    public final /* synthetic */ MSGBloksIXTMuteThreadImplementation A00;
    public final /* synthetic */ FEK A01;
    public final /* synthetic */ GJj A02;

    public Cne(MSGBloksIXTMuteThreadImplementation mSGBloksIXTMuteThreadImplementation, FEK fek, GJj gJj) {
        this.A00 = mSGBloksIXTMuteThreadImplementation;
        this.A01 = fek;
        this.A02 = gJj;
    }

    public final void C8J(Integer num) {
        Object obj;
        11T.A0F(num, 0);
        switch (num.intValue()) {
            case 0:
                obj = "15min";
                break;
            case 1:
                obj = "1hour";
                break;
            case 2:
                obj = "8hours";
                break;
            case 3:
                obj = "1day";
                break;
            case 4:
                obj = "8am";
                break;
            case 5:
                obj = "forever";
                break;
            default:
                obj = "";
                break;
        }
        DKc dKc = new DKc(11T.A03(obj));
        FEK fek = this.A01;
        FEK.A00(fek.A00, dKc, this.A02);
    }
}
