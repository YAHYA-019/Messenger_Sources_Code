package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.91d, reason: invalid class name */
/* loaded from: 91d.class */
public final class C91d extends HGH implements LifecycleObserver {
    public 06Z A00;
    public LifecycleOwner A01;
    public ThreadKey A02;
    public AnonymousClass912 A03;
    public boolean A04;
    public final 1Br A05;
    public final JMq A06;
    public final Context A07;
    public final String A08;

    public C91d(Context context, JMq jMq, String str) {
        11T.A0F(str, 2);
        this.A07 = context;
        this.A08 = str;
        this.A06 = jMq;
        this.A05 = 1Bu.A01(context, 115920);
    }

    public int A00() {
        return 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r303v5, types: [android.view.View] */
    public View A01(Context context, View view) {
        AnonymousClass912 anonymousClass912;
        11T.A0F(context, 0);
        ThreadKey threadKey = this.A02;
        if ((view instanceof AnonymousClass912) && !this.A04) {
            anonymousClass912 = (AnonymousClass912) view;
        } else if (threadKey != null) {
            AnonymousClass912 anonymousClass9122 = new AnonymousClass912(context, threadKey);
            LifecycleOwner lifecycleOwner = this.A01;
            if (lifecycleOwner != null) {
                lifecycleOwner.getLifecycle().addObserver(anonymousClass9122);
                anonymousClass9122.A01 = lifecycleOwner;
            }
            anonymousClass9122.A04 = new 9Lq(this);
            anonymousClass9122.A00 = this.A00;
            anonymousClass912 = anonymousClass9122;
            if (((HGH) this).A00) {
                anonymousClass9122.A03(true);
                anonymousClass912 = anonymousClass9122;
            }
        } else {
            anonymousClass912 = null;
        }
        this.A03 = anonymousClass912;
        ?? r0 = anonymousClass912;
        AnonymousClass912 anonymousClass9123 = anonymousClass912;
        if (r0 == false) {
            anonymousClass9123 = new View(context);
        }
        return anonymousClass9123;
    }

    public C1u3 A02() {
        return 5Ww.A00().migIconName;
    }

    public String A03() {
        return GOm.A00(197);
    }

    public String A04() {
        return this.A08;
    }

    public void A05() {
        super.A05();
        AnonymousClass912 anonymousClass912 = this.A03;
        if (anonymousClass912 != null) {
            anonymousClass912.A03(false);
        }
    }

    public void A06(06Z r302) {
        11T.A0F(r302, 0);
        AnonymousClass912 anonymousClass912 = this.A03;
        if (anonymousClass912 != null) {
            anonymousClass912.A00 = r302;
        }
        this.A00 = r302;
    }

    public void A07(LifecycleOwner lifecycleOwner) {
        this.A01 = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
        this.A04 = true;
    }

    public void A08(ThreadKey threadKey) {
        AnonymousClass912 anonymousClass912;
        this.A02 = threadKey;
        if (threadKey != null && (anonymousClass912 = this.A03) != null) {
            anonymousClass912.A02 = threadKey;
            C9mD c9mD = anonymousClass912.A0J;
            c9mD.A00 = threadKey;
            C9mD.A00(c9mD);
            c9mD.A06(threadKey);
            AnonymousClass912.A01(anonymousClass912);
        }
        this.A04 = true;
    }

    public void A09(MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 0);
        AnonymousClass912 anonymousClass912 = this.A03;
        if (anonymousClass912 != null && !migColorScheme.equals(anonymousClass912.A03)) {
            anonymousClass912.A03 = migColorScheme;
            AnonymousClass912.A01(anonymousClass912);
        }
        this.A04 = true;
    }

    public void A0B(boolean z) {
        ((HGH) this).A00 = true;
        AnonymousClass912 anonymousClass912 = this.A03;
        if (anonymousClass912 != null) {
            anonymousClass912.A03(true);
        }
    }

    public boolean A0C() {
        AnonymousClass912 anonymousClass912 = this.A03;
        if (anonymousClass912 != null) {
            return anonymousClass912.A07.canScrollVertically(-1);
        }
        return false;
    }
}
