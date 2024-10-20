package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.messaging.media.folder.Folder;
import com.facebook.messaging.media.folder.LoadFolderParams;
import com.facebook.messaging.media.mediapicker.mediapickerenvironment.MediaPickerEnvironment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.resources.ui.FbImageButton;
import com.google.common.base.Objects;
import java.util.List;

/* loaded from: I47.class */
public final class I47 {
    public 1BY A00;
    public Folder A01;
    public JMd A02;
    public HRl A03;
    public HRm A04;
    public Hik A05;
    public Hpn A06;
    public Hov A07;
    public FbImageButton A08;
    public final ViewGroup A0A;
    public final MediaPickerEnvironment A0F;
    public final MigColorScheme A0G;
    public final C00i A0D = 1BV.A01((1BY) null, 512);
    public final C00i A0B = 1BV.A01((1BY) null, 510);
    public final C00i A0C = 1BV.A01((1BY) null, 511);
    public final C00i A0E = AbH.A0Q();
    public final List A0I = AnonymousClass001.A0s();
    public final List A0H = AnonymousClass001.A0s();
    public Integer A09 = 0S2.A00;

    public I47(ViewGroup viewGroup, 1BO r303, MediaPickerEnvironment mediaPickerEnvironment, MigColorScheme migColorScheme) {
        this.A00 = 7zL.A0Q(r303);
        this.A0A = viewGroup;
        this.A0F = mediaPickerEnvironment;
        this.A0G = migColorScheme;
    }

    public static void A00(Folder folder, I47 i47, Integer num) {
        RecyclerView recyclerView;
        CharSequence charSequence;
        if (Objects.equal(i47.A01, folder) && i47.A09 == num) {
            return;
        }
        i47.A01 = folder;
        i47.A09 = num;
        Hpn hpn = i47.A06;
        if (hpn != null) {
            if (i47.A0F.A0D) {
                charSequence = "";
            } else if (folder == null) {
                Context context = i47.A0A.getContext();
                int i = 2131960595;
                if (num == 0S2.A01) {
                    i = 2131960567;
                }
                charSequence = context.getString(i);
            } else {
                charSequence = folder.A03;
            }
            hpn.A04.setText(charSequence);
        }
        HRm hRm = i47.A04;
        if (hRm != null) {
            Folder folder2 = i47.A01;
            IEh iEh = hRm.A00;
            I47 i472 = iEh.A07;
            if (i472 != null && (recyclerView = iEh.A03) != null) {
                int height = recyclerView.getHeight();
                JMd jMd = i472.A02;
                if (jMd != null) {
                    jMd.CnL(height);
                }
            }
            I2s i2s = iEh.A0A;
            if (i2s != null && iEh.A0f.A0D) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) i2s.A08.A0F;
                if (linearLayoutManager != null) {
                    linearLayoutManager.Cjt(1, 0);
                }
                String string = folder2 == null ? iEh.A0V.getResources().getString(2131960595) : folder2.A03;
                iEh.A0M = string;
                iEh.A02.setText(string);
                iEh.A02.setVisibility(0);
            }
            IEh.A02(iEh);
            I2s i2s2 = iEh.A0A;
            if (i2s2 != null) {
                i2s2.A01(true);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [com.facebook.messaging.media.picker.MediaPickerTitleView, android.view.View, com.facebook.fbui.widget.text.ImageWithTextView] */
    public void A01() {
        HRj hRj;
        HRl hRl;
        JK0 jk0;
        Hik hik = this.A05;
        if (hik != null && !hik.A03 && (hRj = hik.A01) != null && (hRl = hRj.A00.A03) != null && (jk0 = hRl.A00.A08) != null && jk0.BRL()) {
            hik.A03 = true;
            MediaPickerEnvironment mediaPickerEnvironment = hik.A06;
            hik.A00 = new LoadFolderParams(!mediaPickerEnvironment.A0M, !mediaPickerEnvironment.A0N);
            C00i c00i = hik.A05;
            ((2UV) c00i.get()).A01 = new C2492Gf8(hik);
            ((2UV) c00i.get()).D1t(hik.A00);
        }
        MediaPickerEnvironment mediaPickerEnvironment2 = this.A0F;
        if (mediaPickerEnvironment2.A0L) {
            if (this.A07 == null) {
                Context context = this.A0A.getContext();
                this.A07 = new Hov(context, context.getPackageManager(), mediaPickerEnvironment2.A0M, false);
            }
            List list = this.A0H;
            list.clear();
            list.addAll(this.A07.A00());
            if (list.isEmpty()) {
                return;
            }
            JMd jMd = this.A02;
            if (jMd != null) {
                jMd.Cof(list);
            }
            Hpn hpn = this.A06;
            if (hpn != null) {
                ?? r0 = hpn.A04;
                r0.A06(true);
                r0.setClickable(true);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.messaging.media.picker.MediaPickerTitleView, android.view.View, com.facebook.fbui.widget.text.ImageWithTextView] */
    public void A02() {
        if (this.A06 != null) {
            boolean isEmpty = this.A0I.isEmpty();
            ?? r0 = this.A06.A04;
            boolean z = !isEmpty;
            r0.A06(z);
            r0.setClickable(z);
        }
    }
}
