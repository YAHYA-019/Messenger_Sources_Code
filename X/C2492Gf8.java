package X;

import com.facebook.messaging.media.mediapicker.mediapickerenvironment.MediaPickerEnvironment;
import com.facebook.messaging.media.picker.MediaPickerTitleView;
import com.google.common.collect.ImmutableCollection;
import java.util.List;

/* renamed from: X.Gf8, reason: case insensitive filesystem */
/* loaded from: Gf8.class */
public final class C2492Gf8 extends 2UY {
    public final /* synthetic */ Hik A00;

    public C2492Gf8(Hik hik) {
        this.A00 = hik;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.facebook.messaging.media.picker.MediaPickerTitleView, android.view.View, com.facebook.fbui.widget.text.ImageWithTextView] */
    /* JADX WARN: Type inference failed for: r0v54, types: [android.view.View] */
    public /* bridge */ /* synthetic */ void C4X(Object obj, Object obj2) {
        MediaPickerTitleView mediaPickerTitleView;
        boolean z;
        Hpn hpn;
        ImmutableCollection immutableCollection = (ImmutableCollection) obj2;
        HRk hRk = this.A00.A02;
        if (hRk != null) {
            I47 i47 = hRk.A00;
            List list = i47.A0I;
            list.clear();
            list.addAll(immutableCollection);
            if (list.isEmpty() && i47.A0H.isEmpty()) {
                hpn = i47.A06;
                if (hpn == null) {
                    return;
                }
            } else {
                JMd jMd = i47.A02;
                if (jMd != null) {
                    jMd.Cow(list);
                }
                Hpn hpn2 = i47.A06;
                if (hpn2 == null) {
                    return;
                }
                IJW ijw = new IJW(i47);
                ?? r0 = hpn2.A04;
                r0.A06(true);
                r0.setOnClickListener(ijw);
                HRl hRl = i47.A03;
                if (hRl == null || !hRl.A00.A0D()) {
                    MediaPickerEnvironment mediaPickerEnvironment = i47.A0F;
                    if (!mediaPickerEnvironment.A06 && !mediaPickerEnvironment.A0I) {
                        mediaPickerTitleView = i47.A06.A04;
                        z = true;
                        mediaPickerTitleView.A06(z);
                        mediaPickerTitleView.setClickable(z);
                    }
                }
                hpn = i47.A06;
            }
            mediaPickerTitleView = hpn.A04;
            z = false;
            mediaPickerTitleView.A06(z);
            mediaPickerTitleView.setClickable(z);
        }
    }
}
