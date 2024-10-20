package X;

import android.content.Context;
import com.facebook.messaging.business.search.model.PlatformSearchData;
import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* loaded from: Cpb.class */
public final class Cpb implements DIA {
    public final /* synthetic */ AoH A00;

    public Cpb(AoH aoH) {
        this.A00 = aoH;
    }

    public String Aab(Object obj) {
        if (obj instanceof User) {
            return ((User) obj).A13;
        }
        if (obj instanceof ThreadSummary) {
            return AbK.A17((ThreadSummary) obj);
        }
        if (obj instanceof PlatformSearchUserData) {
            return ((PlatformSearchUserData) obj).A04;
        }
        if (obj instanceof PlatformSearchGameData) {
            return ((PlatformSearchGameData) obj).A00.A0E;
        }
        throw 0Pz.A05("This is not a supported result type: ", obj.getClass().getCanonicalName());
    }

    public ImmutableList AzT(Object obj) {
        AoH aoH;
        Name name;
        if (obj instanceof User) {
            aoH = this.A00;
            name = ((User) obj).A0X;
        } else {
            if (obj instanceof ThreadSummary) {
                AoH aoH2 = this.A00;
                ThreadSummary threadSummary = (ThreadSummary) obj;
                StringBuilder A0k = AnonymousClass001.A0k();
                String str = threadSummary.A20;
                if (!1JF.A0A(str)) {
                    A0k.append(str);
                    A0k.append(" ");
                }
                String str2 = (String) 1Bn.A0E((Context) null, aoH2.A00, 83433);
                ImmutableList immutableList = threadSummary.A1L;
                if (immutableList != null) {
                    1Du it = immutableList.iterator();
                    while (it.hasNext()) {
                        ThreadParticipant A0W = 4YU.A0W(it);
                        if (!1JF.A0C(str2, C28p.A01(A0W).id)) {
                            String A02 = C28p.A02(A0W);
                            if (!1JF.A0A(A02)) {
                                A0k.append(A02);
                                A0k.append(" ");
                            }
                        }
                    }
                }
                return ((C3A) aoH2.A04.get()).A00(A0k.toString());
            }
            if (!(obj instanceof PlatformSearchData)) {
                throw 0Pz.A05("This is not a supported result type: ", obj.getClass().getCanonicalName());
            }
            aoH = this.A00;
            name = ((PlatformSearchData) obj).A01;
        }
        String str3 = name.firstName;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = name.lastName;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = name.displayName;
        if (str5 == null) {
            str5 = "";
        }
        return ((C3A) aoH.A04.get()).A00(0Pz.A0z(str3, " ", str4, " ", str5));
    }

    public /* bridge */ /* synthetic */ Object BK8(Object obj) {
        CCv cCv;
        if (obj instanceof User) {
            int intValue = ((User) obj).A0x.intValue();
            cCv = intValue != 1 ? intValue != 2 ? AoH.A09 : AoH.A0B : AoH.A06;
        } else {
            cCv = obj instanceof ThreadSummary ? AoH.A08 : obj instanceof PlatformSearchUserData ? AoH.A0A : obj instanceof PlatformSearchGameData ? AoH.A07 : null;
        }
        return ((BJC) this.A00).A00.AIt(cCv, obj);
    }
}
