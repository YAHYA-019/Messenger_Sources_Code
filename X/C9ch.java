package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.9ch, reason: invalid class name */
/* loaded from: 9ch.class */
public final class C9ch {
    public 96C A00;
    public final 2bX A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final List A08;

    public C9ch(Context context, FbUserSession fbUserSession) {
        Object obj;
        96C r0 = 96C.A08;
        this.A01 = new LiveData(r0);
        this.A06 = 1Bu.A01(context, 68891);
        this.A03 = 7zM.A0Z();
        this.A07 = 1Lm.A00(context, fbUserSession, 68884);
        this.A02 = 7zM.A0W();
        this.A04 = 7zM.A0b();
        this.A05 = 1Bu.A00(68812);
        List A14 = C0s8.A14(96C.A05, 96C.A03, 96C.A06, 96C.A04, 96C.A02);
        this.A08 = A14;
        Set A01 = A01();
        Iterator it = A14.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (A01.contains(obj)) {
                    break;
                }
            }
        }
        96C r02 = (96C) obj;
        this.A00 = r02;
        if (r02 == null) {
            0fH.A0k("EbRestoreOptionViewData", AnonymousClass001.A0Z(r02, "initialSelectedOption ", AnonymousClass001.A0k()));
        }
        2bX r03 = this.A01;
        96C r305 = this.A00;
        r03.setValue(r305 == null ? r0 : r305);
    }

    public final C97j A00() {
        Integer A0x = 7zS.A0x(this.A05);
        switch (((96C) this.A01.getValue()).ordinal()) {
            case 0:
                return C97j.A0a;
            case 1:
                return C97j.A0Y;
            case 2:
                return 9dB.A01(A0x) ? C97j.A0N : C97j.A0E;
            case 3:
                return C97j.A0e;
            case 4:
                1Br.A0C(this.A06);
                return C97j.A0E;
            case 5:
                return C97j.A0T;
            case 6:
                return C97j.A0Z;
            default:
                throw 1BK.A1F();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r307v0 */
    /* JADX WARN: Type inference failed for: r307v1 */
    /* JADX WARN: Type inference failed for: r307v3, types: [java.util.AbstractCollection] */
    public final Set A01() {
        Collection collection;
        Set set;
        96C r0;
        Set A01 = 02H.A01(new 96C[]{96C.A08});
        C00i c00i = this.A07.A00;
        if (1BK.A1X(((C9c4) c00i.get()).A00(), true) && 7zP.A0a(this.A02).A05()) {
            A01.add(96C.A04);
        }
        99P r02 = (99P) ((C9c4) c00i.get()).A03.getValue();
        if (!(r02 instanceof C8sp) || (set = ((C8sp) r02).A00) == null) {
            collection = C0uA.A00;
        } else {
            collection = AnonymousClass001.A0s();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int ordinal = ((C96p) it.next()).ordinal();
                if (ordinal == 0) {
                    r0 = 96C.A02;
                } else if (ordinal == 1) {
                    r0 = 96C.A06;
                } else if (ordinal == 5) {
                    C1ud A0a = 7zP.A0a(this.A02);
                    if (!7zM.A1a(A0a, C1ud.A00(A0a), 36316426691160056L)) {
                        r0 = 96C.A03;
                    }
                } else if (ordinal == 8) {
                    r0 = 96C.A05;
                }
                collection.add(r0);
            }
        }
        A01.addAll(collection);
        return A01;
    }

    public final void A02() {
        C9up A0Z;
        String str;
        switch (((96C) this.A01.getValue()).ordinal()) {
            case 0:
                A0Z = 7zO.A0Z(this.A04);
                str = "RESTORE_OPTIONS_SCREEN_ACTION_PIN";
                break;
            case 1:
                A0Z = 7zO.A0Z(this.A04);
                str = "RESTORE_OPTIONS_SCREEN_ACTION_OTC";
                break;
            case 2:
                7zO.A0Z(this.A04).A05("RESTORE_OPTIONS_SCREEN_ACTION_SKIP");
                return;
            case 3:
                A0Z = 7zO.A0Z(this.A04);
                str = "RESTORE_OPTIONS_SCREEN_ACTION_RECOVERY_CODE";
                break;
            case 4:
                1Br.A0C(this.A06);
                return;
            case 5:
                A0Z = 7zO.A0Z(this.A04);
                str = "RESTORE_OPTIONS_SCREEN_ACTION_GDRIVE";
                break;
            case 6:
                A0Z = 7zO.A0Z(this.A04);
                str = "RESTORE_OPTIONS_SCREEN_ACTION_PASSKEY";
                break;
            default:
                return;
        }
        A0Z.A07(str);
    }
}
