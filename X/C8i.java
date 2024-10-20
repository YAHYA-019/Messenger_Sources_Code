package X;

import com.facebook.messaging.integrity.frx.model.FRXEvidencePrompt;
import com.facebook.messaging.integrity.frx.model.ProactiveWarningParams;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;
import java.util.HashSet;
import java.util.Set;

/* loaded from: C8i.class */
public final class C8i {
    public C5yq A00;
    public FRXEvidencePrompt A01;
    public ProactiveWarningParams A02;
    public Message A03;
    public ThreadKey A04;
    public ThreadSummary A05;
    public MigColorScheme A06;
    public UserKey A07;
    public C5yl A08;
    public Integer A09;
    public String A0A;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public Set A0C = AnonymousClass001.A0v();
    public String A0B = "";

    public /* bridge */ /* synthetic */ void A00(MigColorScheme migColorScheme) {
        this.A06 = migColorScheme;
        C1pq.A08("colorScheme", migColorScheme);
    }

    public void A01(Integer num) {
        this.A09 = num;
        C1pq.A08("fRXType", num);
        if (this.A0C.contains("fRXType")) {
            return;
        }
        HashSet A1E = AbF.A1E(this.A0C);
        this.A0C = A1E;
        A1E.add("fRXType");
    }
}
