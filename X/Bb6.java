package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: Bb6.class */
public final class Bb6 {
    public final DHu A00;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Bb6(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, User user, Capabilities capabilities, 2Sh r313, String str, String str2) {
        DHu cdG;
        switch (str.hashCode()) {
            case -2032367749:
                if (str.equals("FBM_E2EE_Group")) {
                    cdG = new Cd7(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case -2028326372:
                if (str.equals("Advanced_Crypto_One_To_One")) {
                    cdG = new CdN(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case -1968093802:
                if (str.equals("Group_From_Calls_Tab")) {
                    cdG = new CdK(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case -1789773641:
                if (str.equals("Tincan")) {
                    cdG = new CdM(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case -1677249939:
                if (str.equals("Community_Channel")) {
                    cdG = new CdH(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313);
                    break;
                }
                throw 1BL.A0l(str);
            case -1540523081:
                if (str.equals("Advanced_Crypto_Group_From_Calls_Tab")) {
                    cdG = new CdF(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case -319476414:
                if (str.equals("Advanced_Crypto_One_To_One_Viewer_Blocked")) {
                    cdG = new CdA(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313);
                    break;
                }
                throw 1BL.A0l(str);
            case 83257:
                if (str.equals("Sms")) {
                    cdG = new CdE(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case 2479791:
                if (str.equals("Page")) {
                    cdG = new CdJ(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case 69076575:
                if (str.equals("Group")) {
                    cdG = new CdP(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case 535414559:
                if (str.equals("FBM_E2EE_One_To_One")) {
                    cdG = new CdC(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case 586338158:
                if (str.equals("Public_Chat")) {
                    cdG = new Rmw(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case 1231197341:
                if (str.equals("Interop_One_To_One")) {
                    cdG = new Cd8(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case 1257764539:
                if (str.equals("One_To_One")) {
                    cdG = new CdO(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case 1495954014:
                if (str.equals("Advanced_Crypto_Group")) {
                    cdG = new CdI(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case 1644629634:
                if (str.equals("FBM_Open_One_To_One")) {
                    cdG = new CdD(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case 1730482618:
                if (str.equals("One_To_One_From_Calls_Tab")) {
                    cdG = new CdL(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case 1867705912:
                if (str.equals("FBM_Open_Group")) {
                    cdG = new CdB(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case 1960761648:
                if (str.equals("Ai_Bot")) {
                    cdG = new Rmx(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case 1999424946:
                if (str.equals("Whatsapp")) {
                    cdG = new Cd9(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case 2114235222:
                if (str.equals("Advanced_Crypto_Message_Request")) {
                    cdG = new CdG(context, r303, fbUserSession, threadKey, threadSummary, djx, dHb, dHc, dHd, user, capabilities, r313, str2);
                    break;
                }
                throw 1BL.A0l(str);
            default:
                throw 1BL.A0l(str);
        }
        this.A00 = cdG;
    }
}
