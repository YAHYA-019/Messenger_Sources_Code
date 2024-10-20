package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.73l, reason: invalid class name */
/* loaded from: 73l.class */
public final class C73l implements 6xM {
    public HashSet A00;
    public boolean A01;

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7AO.class));
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "AboveComposerBannerPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        if (r305 instanceof 7AO) {
            Object obj = ((7AO) r305).A00;
            if (obj instanceof AnonymousClass690) {
                if (!this.A01) {
                    this.A01 = true;
                }
                78K AUP = c77n.AUP(78K.class);
                AnonymousClass690 anonymousClass690 = (AnonymousClass690) obj;
                11T.A0F(AUP, 1);
                11T.A0F(anonymousClass690, 2);
                AnonymousClass690 anonymousClass6902 = AUP.A00;
                if (anonymousClass690.equals(anonymousClass6902)) {
                    return;
                }
                AnonymousClass690 anonymousClass6903 = AnonymousClass691.A00;
                if (anonymousClass690.equals(anonymousClass6903) && anonymousClass6902 == null) {
                    return;
                }
                if (anonymousClass690.equals(anonymousClass6903)) {
                    anonymousClass690 = null;
                }
                c77n.ClL(new 78K(anonymousClass690));
            }
        }
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z || this.A01) {
            return;
        }
        this.A01 = true;
    }
}
