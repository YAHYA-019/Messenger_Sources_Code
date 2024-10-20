package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.messaging.attachments.VideoAttachmentData;
import com.facebook.messaging.extensions.common.ExtensionParams;
import com.facebook.messaging.media.prefetch.XMACacheData;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.pagesurface.about.params.PageAboutInputParams;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.sync.SyncInitializer;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.video.exoserviceclient.FbVpsController;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: A37.class */
public final class A37 implements C02l {
    public final int A00;
    public final Object A01;

    public A37(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v148, types: [java.lang.Object, com.facebook.messaging.extensions.common.ExtensionParams] */
    @Override // X.C02l
    public final void CFb(Context context, Intent intent, C01q c01q) {
        int A04;
        boolean z;
        C5cv c5cv;
        int i;
        XMACacheData xMACacheData;
        QuickPerformanceLogger A0U;
        String str;
        6cM r0;
        VideoAttachmentData videoAttachmentData;
        MediaResource mediaResource;
        switch (this.A00) {
            case 0:
                A04 = 1BL.A04(intent, -2097397626);
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(AnonymousClass000.A00(8));
                if (parcelableArrayListExtra != null) {
                    Iterator it = parcelableArrayListExtra.iterator();
                    while (it.hasNext()) {
                        if (ThreadKey.A0i((ThreadKey) it.next())) {
                            z = true;
                            if ((!AnonymousClass000.A00(100).equals(intent.getAction()) || z) && (c5cv = ((C5d0) this.A01).A01) != null) {
                                c5cv.CGE();
                            }
                            i = -706952639;
                            break;
                        }
                    }
                }
                z = false;
                if (!AnonymousClass000.A00(100).equals(intent.getAction())) {
                }
                c5cv.CGE();
                i = -706952639;
            case 1:
                A04 = C09o.A00(-1602277839);
                11T.A0F(intent, 1);
                0fH.A0j(C5xt.__redex_internal_original_name, "On MULTIPLE_THREADS_UPDATED_FOR_UI received");
                ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra(AnonymousClass000.A00(8));
                if (parcelableArrayListExtra2 != null) {
                    C5xt c5xt = (C5xt) this.A01;
                    if (parcelableArrayListExtra2.contains(c5xt.A04)) {
                        c5xt.A00();
                    }
                }
                i = -1216420175;
                break;
            case 2:
                A04 = C09o.A00(-1500786809);
                6wY.A00((6wY) this.A01);
                i = 2086521872;
                break;
            case 3:
                A04 = 1BL.A04(intent, -616934931);
                Bundle extras = intent.getExtras();
                if (11T.A0O(extras != null ? extras.get(1BJ.A00(ActionId.FAIL_FILE_TOO_LARGE)) : null, AbE.A00(327))) {
                    C7Nz c7Nz = (C7Nz) this.A01;
                    InterstitialTrigger interstitialTrigger = 2bG.A03;
                    11T.A0B(interstitialTrigger);
                    c7Nz.D59(interstitialTrigger, 0S2.A1G, null);
                }
                i = 253789935;
                break;
            case 4:
                A04 = 1BL.A04(intent, -574564879);
                if (11T.A0O(1F9.A06.dbName, intent.getStringExtra(1BJ.A00(427)))) {
                    5dD.A00((5dD) this.A01);
                }
                i = -392223011;
                break;
            case 5:
                A04 = C09o.A00(1871314816);
                ((6Gl) this.A01).A04.CVn((ExtensionParams) intent.getParcelableExtra("extension_params"));
                i = 2076433733;
                break;
            case 6:
                A04 = C09o.A00(497821361);
                6Gk r02 = (6Gk) this.A01;
                PageAboutInputParams pageAboutInputParams = (PageAboutInputParams) intent.getParcelableExtra("page_about_input_params_extra");
                95I r03 = 95I.A02;
                BP7 bp7 = BP7.PAGE_ABOUT;
                ThreadKey BF7 = r02.A05.BF7();
                String str2 = pageAboutInputParams == null ? null : pageAboutInputParams.A02;
                ?? obj = new Object();
                obj.A06 = bp7;
                obj.A01 = 2131230725;
                obj.A02 = 2131962878;
                obj.A00 = -1;
                obj.A03 = pageAboutInputParams;
                obj.A05 = r03;
                obj.A07 = BF7;
                obj.A0A = false;
                obj.A0C = true;
                obj.A09 = str2;
                obj.A0B = true;
                obj.A08 = null;
                obj.A04 = null;
                r02.A04.CVn((ExtensionParams) obj);
                i = -1121122179;
                break;
            case 7:
                A04 = C09o.A00(17568328);
                6cM.A0K((6cM) this.A01);
                i = -614574927;
                break;
            case 8:
                A04 = C09o.A00(50140532);
                XMACacheData xMACacheData2 = (XMACacheData) intent.getParcelableExtra("xma_cache_data");
                String stringExtra = intent.getStringExtra(TraceFieldType.VideoId);
                if (xMACacheData2 != null && stringExtra != null) {
                    6cM r04 = (6cM) this.A01;
                    C00i c00i = 6cM.A1j;
                    VideoAttachmentData videoAttachmentData2 = r04.A0k;
                    if (videoAttachmentData2 != null && stringExtra.equals(videoAttachmentData2.A0K) && ((xMACacheData = r04.A0l) == null || !xMACacheData.equals(xMACacheData2))) {
                        r04.A0l = xMACacheData2;
                        6cM.A0P(r04, true);
                    }
                }
                i = -850373014;
                break;
            case 9:
                A04 = C09o.A00(-686114631);
                C00i c00i2 = 6cM.A1j;
                1BK.A0U(c00i2).markerStart(238950334);
                MediaResource mediaResource2 = (MediaResource) intent.getParcelableExtra("resource");
                if (mediaResource2 != null && (videoAttachmentData = (r0 = (6cM) this.A01).A0k) != null && (mediaResource = videoAttachmentData.A0I) != null) {
                    Message message = r0.A0m;
                    ImmutableList immutableList = C1q7.A07;
                    if (message.A04() == C1q8.A0M) {
                        if (81I.A01(mediaResource2).equals(81I.A01(mediaResource))) {
                            6cM.A0F(r0);
                            if (6cM.A0T(r0)) {
                                6cM.A0K(r0);
                            }
                            i = -1404851927;
                            break;
                        } else {
                            A0U = 1BK.A0U(c00i2);
                            str = "video_shoudlnt_update";
                            A0U.markerPoint(238950334, str);
                            1BK.A0U(c00i2).markerEnd(238950334, (short) 2);
                            i = -1404851927;
                        }
                    }
                }
                A0U = 1BK.A0U(c00i2);
                str = "video_is_null_or_not_pending";
                A0U.markerPoint(238950334, str);
                1BK.A0U(c00i2).markerEnd(238950334, (short) 2);
                i = -1404851927;
                break;
            case 10:
                A04 = C09o.A00(2097455324);
                ((C5d7) this.A01).A02();
                i = -1218140688;
                break;
            case 11:
                A04 = C09o.A00(-1391128168);
                if (C1og.CHANNEL_CONNECTED == C1og.A00(intent.getIntExtra("event", C1og.UNKNOWN.value))) {
                    0fH.A0A(SyncInitializer.class, "Mqtt connected. Ensuring sync if it is enabled.");
                    SyncInitializer syncInitializer = (SyncInitializer) this.A01;
                    SyncInitializer.A00(EnumC06914ib.NORMAL, syncInitializer, 1BJ.A00(485), syncInitializer.A0C);
                }
                i = 806115194;
                break;
            case 12:
                A04 = C09o.A00(1441403288);
                SyncInitializer syncInitializer2 = (SyncInitializer) this.A01;
                if (!syncInitializer2.A07.A00()) {
                    i = 723366899;
                    break;
                } else {
                    String action = intent.getAction();
                    InterfaceC06564ha interfaceC06564ha = (InterfaceC06564ha) syncInitializer2.A0B.get(action);
                    if (interfaceC06564ha != null && interfaceC06564ha.isEnabled()) {
                        interfaceC06564ha.Cbv(action);
                    }
                    i = -1113579654;
                    break;
                }
                break;
            default:
                A04 = C09o.A00(-21500340);
                FbVpsController.A05((FbVpsController) this.A01);
                i = 1922466855;
                break;
        }
        C09o.A01(i, A04);
    }
}
