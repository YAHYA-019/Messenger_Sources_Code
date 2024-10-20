package X;

import com.facebook.messaging.composer.stax.theme.model.MigComposerColorTheme;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.70a, reason: invalid class name */
/* loaded from: 70a.class */
public final class C70a implements 6xM {
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
        return "ColorSchemePlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        if (r305 instanceof 7AO) {
            Object obj = ((7AO) r305).A00;
            if (obj instanceof MigComposerColorTheme) {
                if (!this.A01) {
                    this.A01 = true;
                }
                MigComposerColorTheme migComposerColorTheme = (MigComposerColorTheme) obj;
                11T.A0F(c77n, 0);
                11T.A0F(migComposerColorTheme, 1);
                c77n.ClL(C6xo.A00(migComposerColorTheme));
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
