package X;

import android.text.SpannedString;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.77h, reason: invalid class name */
/* loaded from: 77h.class */
public final class C77h implements 6xM {
    public HashSet A00 = null;
    public boolean A01;
    public final Fragment A02;
    public final C77c A03;
    public final 6wV A04;
    public final boolean A05;
    public final boolean A06;

    public C77h(Fragment fragment, C77c c77c, 6wV r304, boolean z, boolean z2) {
        this.A02 = fragment;
        this.A05 = z;
        this.A06 = z2;
        this.A03 = c77c;
        this.A04 = r304;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7DE.class, 7Cp.class, 7DG.class, 7DH.class));
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "AiBotMultiModalNuxPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        C77c c77c;
        Fragment fragment;
        int i;
        7fJ r0;
        if ((r305 instanceof 7Cp) || (r305 instanceof 7DE) || (r305 instanceof 7DG)) {
            if (!this.A01) {
                this.A01 = true;
            }
            c77c = this.A03;
            fragment = this.A02;
            6wV r02 = this.A04;
            boolean z = this.A05;
            i = 0;
            11T.A0F(r304, 0);
            if (!z) {
                SpannedString valueOf = SpannedString.valueOf(r02.getText());
                7Sg[] r03 = (7Sg[]) valueOf.getSpans(0, valueOf.length(), 7Sg.class);
                11T.A0D(r03);
                for (7Sg r04 : r03) {
                    C6qi c6qi = r04.A00;
                    int i2 = (c6qi == C6qi.A02 || c6qi == C6qi.A03) ? 0 : i2 + 1;
                }
                return;
            }
        } else {
            if (!(r305 instanceof 7DH)) {
                return;
            }
            if (!this.A01) {
                this.A01 = true;
            }
            7DH r05 = (7DH) r305;
            c77c = this.A03;
            fragment = this.A02;
            boolean z2 = this.A06;
            C78c c78c = (C78c) c77n.AUk(null, C78c.class);
            C77w c77w = (C77w) c77n.AUk(null, C77w.class);
            boolean A1W = 1BL.A1W(r304, r05);
            7fJ r06 = r05.A00;
            if (!(r06 instanceof 7fJ) || (r0 = r06) == null) {
                return;
            }
            C6qi c6qi2 = r0.A00;
            if (c6qi2 != C6qi.A02 && c6qi2 != C6qi.A03) {
                return;
            }
            i = 0;
            if (c78c == null || (!c78c.A00.isEmpty()) != A1W) {
                return;
            }
            if (c77w != null) {
                int i3 = c77w.A00;
                Integer valueOf2 = Integer.valueOf(i3);
                if (z2 && c77w.A03 == A1W && valueOf2 != null) {
                    i = i3;
                }
            }
        }
        View view = fragment.mView;
        if (view != null) {
            c77c.A0E(r304.A00, view, i);
        }
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z || this.A01) {
            return;
        }
        this.A01 = true;
    }
}
