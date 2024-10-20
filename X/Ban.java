package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: Ban.class */
public final class Ban {
    public final DIK A00;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Ban(Context context, LifecycleOwner lifecycleOwner, DFp dFp, String str, String str2) {
        CcW ccT;
        switch (str.hashCode()) {
            case -2059257354:
                if (str.equals("PermissionSection")) {
                    ccT = new CcW(context, lifecycleOwner, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case -1795983266:
                if (str.equals("HideContact")) {
                    ccT = new CcR(context, lifecycleOwner, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case -1734725701:
                if (str.equals("ChatSettings")) {
                    ccT = new CcV(context, lifecycleOwner, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case -1679493450:
                if (str.equals("EndToEndChats")) {
                    ccT = new Ccb(context, lifecycleOwner, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case -1601196187:
                if (str.equals("SecuritySection")) {
                    ccT = new Ccd(context, lifecycleOwner, dFp, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case -462877230:
                if (str.equals("BlockedAccounts")) {
                    ccT = new CcQ(context, lifecycleOwner, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case 80218325:
                if (str.equals("Story")) {
                    ccT = new CcX(context, lifecycleOwner, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case 335296403:
                if (str.equals("SafetySection")) {
                    ccT = new CcZ(context, lifecycleOwner, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case 417727941:
                if (str.equals("Armadillo")) {
                    ccT = new Cca(context, lifecycleOwner, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case 516741829:
                if (str.equals("ContactSection")) {
                    ccT = new Ccc(context, lifecycleOwner, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case 806605458:
                if (str.equals("MessageContent")) {
                    ccT = new CcS(context, lifecycleOwner, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case 870470348:
                if (str.equals("AppLock")) {
                    ccT = new CcP(context, lifecycleOwner, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case 914500562:
                if (str.equals("EndToEndChatsV2")) {
                    ccT = new CcY(context, lifecycleOwner, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case 958774099:
                if (str.equals("VisibilitySection")) {
                    ccT = new Cce(context, lifecycleOwner, dFp, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case 1146510403:
                if (str.equals("AdvancedSection")) {
                    ccT = new CcU(context, lifecycleOwner, dFp, str2);
                    break;
                }
                throw 1BL.A0l(str);
            case 1519222029:
                if (str.equals("PrivacyCheckupsSection")) {
                    ccT = new CcO(context, lifecycleOwner, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            case 2142525825:
                if (str.equals("RestrictedAccounts")) {
                    ccT = new CcT(context, lifecycleOwner, dFp);
                    break;
                }
                throw 1BL.A0l(str);
            default:
                throw 1BL.A0l(str);
        }
        this.A00 = ccT;
    }
}
