package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Bb2.class */
public final class Bb2 {
    public final DIL A00;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Bb2(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, DFp dFp, String str) {
        DIL ccv;
        switch (str.hashCode()) {
            case -2121958038:
                if (str.equals("PreferenceSection")) {
                    ccv = new Ccz(context, r303, fbUserSession, r305, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case -1931331449:
                if (str.equals("ServicesSection")) {
                    ccv = new Ccn(context, r303, fbUserSession, r305, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case -1706737979:
                if (str.equals("MessengerKidsSection")) {
                    ccv = new Ccq(context, r303, fbUserSession, r305, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case -1623054680:
                if (str.equals("EphemeralSection")) {
                    ccv = new Ccu(context, r303, fbUserSession, r305, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case -1125058576:
                if (str.equals("TopSection")) {
                    ccv = new Ccy(context, r303, fbUserSession, r305, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case -397514424:
                if (str.equals("InternalSection")) {
                    ccv = new Ccr(context, r303, fbUserSession, r305, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case 139122972:
                if (str.equals("ProfileSection")) {
                    ccv = new Ccx(context, r303, fbUserSession, r305, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case 155269516:
                if (str.equals("ForMsplitSettingsSection")) {
                    ccv = new Ccp(context, r303, fbUserSession, r305, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case 228116890:
                if (str.equals("ForFamiliesSection")) {
                    ccv = new Cco(context, r303, fbUserSession, r305, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case 265754346:
                if (str.equals("BumpedAccountsSection")) {
                    ccv = new Ccw(context, r303, fbUserSession, r305, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case 646068362:
                if (str.equals("BusinessToolsSection")) {
                    ccv = new Cct(context, r303, fbUserSession, r305, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case 1591062734:
                if (str.equals("AlsoFromFacebookSection")) {
                    ccv = new Ccs(context, r303, fbUserSession, r305, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case 1686174744:
                if (str.equals("AccountSection")) {
                    ccv = new Ccv(context, r303, fbUserSession, r305, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            default:
                throw 1BL.A0l(str);
        }
        this.A00 = ccv;
    }
}
