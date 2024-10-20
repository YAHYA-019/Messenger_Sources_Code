package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.customthreads.themepreview.ThemePreviewFragment;
import com.facebook.messaging.customthreads.threadsettings.picker.ThreadCustomizationPickerFragment;
import com.facebook.ui.emoji.model.Emoji;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.mapbox.mapboxsdk.style.layers.Property;

/* renamed from: X.9bf, reason: invalid class name */
/* loaded from: 9bf.class */
public final class C9bf {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ 06Z A01;
    public final /* synthetic */ ThreadCustomizationPickerFragment A02;
    public final /* synthetic */ 6Gs A03;

    public C9bf(Fragment fragment, 06Z r303, ThreadCustomizationPickerFragment threadCustomizationPickerFragment, 6Gs r305) {
        this.A03 = r305;
        this.A01 = r303;
        this.A00 = fragment;
        this.A02 = threadCustomizationPickerFragment;
    }

    public void A00(Emoji emoji, String str) {
        6GA r0 = this.A03.A08;
        2Ov r02 = this.A02;
        r0.C3Y(emoji, str, r02.mArguments.getString(Property.SYMBOL_Z_ORDER_SOURCE));
        r02.A0p();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void A01(ThreadThemeInfo threadThemeInfo, String str, boolean z, boolean z2) {
        06Z r0;
        98D r317;
        6Gs r02 = this.A03;
        5zD BFT = r02.A07.BFT();
        long j = BFT.BEz().A0S;
        long j2 = threadThemeInfo.A0S;
        if (j != j2 && (r0 = this.A01) != null && 1Br.A07(((C5yd) r02.A06.get()).A01).AZk(36319291427075960L)) {
            C00i c00i = r02.A02;
            if (!((77G) c00i.get()).A01() || j2 != 3259963564026002L) {
                ThreadThemeInfo BEz = BFT.BEz();
                6Fy r03 = r02.A0A;
                ThemePreviewFragment.A09.A00(r03.BF7(), r03.AgO().A03, threadThemeInfo, BEz, (String) null, ((77G) c00i.get()).A01(), z, false, z2, false).A0m(r0, "ThemePreviewFragment");
                String A02 = threadThemeInfo.A02();
                switch (A02.hashCode()) {
                    case -786382386:
                        if (A02.equals("THIRD_PARTY")) {
                            r317 = 98D.A04;
                            break;
                        }
                        r317 = null;
                        break;
                    case 79789481:
                        if (A02.equals("THEME")) {
                            r317 = 98D.A03;
                            break;
                        }
                        r317 = null;
                        break;
                    case 1008568514:
                        if (A02.equals("AI_GENERATED_THEME")) {
                            r317 = 98D.A01;
                            break;
                        }
                        r317 = null;
                        break;
                    case 1806982316:
                        if (A02.equals("COLOR_GRADIENT")) {
                            r317 = 98D.A02;
                            break;
                        }
                        r317 = null;
                        break;
                    default:
                        r317 = null;
                        break;
                }
                ((6NA) r02.A03.get()).A02(r317, r03.BF7(), str, j2);
                return;
            }
        }
        9Zo r04 = (9Zo) r02.A05.get();
        Context context = this.A00.getContext();
        FbUserSession fbUserSession = r02.A01;
        2Ov r05 = this.A02;
        String string = r05.mArguments.getString(Property.SYMBOL_Z_ORDER_SOURCE);
        06Z AcP = r02.A09.AcP();
        6Fy r06 = r02.A0A;
        r04.A00(context, AcP, fbUserSession, r06.BF7(), r06.AgO().A03, threadThemeInfo, string, (String) null, str, false);
        r05.A0p();
    }
}
