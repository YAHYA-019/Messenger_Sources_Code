package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphservice.factory.GraphQLServiceFactory;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.tree.TreeBuilderJNI;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.messaging.attachments.ImageAttachmentUris;
import com.facebook.messaging.attachments.VideoAttachmentData;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.messenger.plugins.msysopenmessagingattachmentdeletionplugin.MsysOpenMessagingAttachmentDeletionPluginPostmailbox;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: In2.class */
public final class In2 implements Supplier {
    public final int A00;
    public final Object A01;

    public In2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // com.google.common.base.Supplier
    public /* bridge */ /* synthetic */ Object get() {
        Tree tree;
        Hsm Avt;
        switch (this.A00) {
            case 0:
                return Integer.valueOf(((ISf) this.A01).A00.A01());
            case 1:
                IXN ixn = (IXN) this.A01;
                tree = null;
                if (IXN.A01(ixn)) {
                    try {
                        String A05 = ixn.A05();
                        String A04 = ixn.A04();
                        C1pq.A08("mediaId", A04);
                        String A06 = ixn.A06();
                        MontageCard montageCard = ixn.A01;
                        String str = null;
                        if (GOp.A1X(montageCard) && montageCard.A07.equals(48J.A05)) {
                            VideoAttachmentData A00 = ((C69m) ixn.A05.get()).A00(montageCard);
                            if (A00 != null && A00.A00() != null && A00.A00().A03 != null) {
                                str = A00.A00().A03.toString();
                            }
                        }
                        String str2 = null;
                        if (IXN.A01(ixn)) {
                            48J r0 = montageCard.A07;
                            if (r0 == 48J.A05) {
                                str2 = ixn.A05();
                            } else if (r0 == 48J.A02 || r0 == 48J.A03) {
                                ImmutableList A01 = ((C69m) ixn.A05.get()).A01(montageCard);
                                if (!A01.isEmpty()) {
                                    str2 = C69n.A01((ImageAttachmentData) A01.get(0))[0].A05.toString();
                                }
                            }
                        }
                        int i = !GOp.A1X(montageCard) ? 0 : (int) montageCard.A04;
                        int A03 = ixn.A03();
                        int A02 = ixn.A02();
                        String str3 = null;
                        if (GOp.A1X(montageCard)) {
                            C00i c00i = ixn.A05;
                            if (((C69m) c00i.get()).A02(montageCard)) {
                                ImmutableList A012 = ((C69m) c00i.get()).A01(montageCard);
                                if (!A012.isEmpty()) {
                                    ImageAttachmentData imageAttachmentData = (ImageAttachmentData) A012.get(0);
                                    if (imageAttachmentData != null) {
                                        ImageAttachmentUris imageAttachmentUris = imageAttachmentData.A05;
                                        if (imageAttachmentUris != null) {
                                            str3 = imageAttachmentUris.A02.toString();
                                        }
                                    }
                                }
                            }
                        }
                        return new Hsm(str3, str2, A04, str, A05, A06, i, A02, A03);
                    } catch (IllegalArgumentException e) {
                        0fH.A0w(GL2.A00, "Illegal argument on MontageStoryCard media", e);
                        return null;
                    }
                }
                return tree;
            default:
                IXN ixn2 = (IXN) this.A01;
                tree = null;
                if (IXN.A01(ixn2) && (Avt = ixn2.Avt()) != null) {
                    Object obj = 2JZ.A01;
                    TreeBuilderJNI A0N = AbF.A0N(2tS.A00(), C2557Gh8.class, "Media", 1616276231);
                    TreeBuilderJNI A0N2 = AbF.A0N(2tS.A00(), 6As.class, "Image", -10228656);
                    A0N2.setString(TraceFieldType.Uri, Avt.A07);
                    A0N.setTree("low_res", A0N2.getResult(2JX.class, -10228656));
                    A0N.setString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, ixn2.A04());
                    String str4 = Avt.A08;
                    A0N.setString(MsysOpenMessagingAttachmentDeletionPluginPostmailbox.PLAYABLE_URL, str4);
                    A0N.setString("playlist", (String) null);
                    Integer A0k = 4YU.A0k();
                    A0N.setInt("atom_size", A0k);
                    A0N.setInt(TraceFieldType.Bitrate, A0k);
                    A0N.setInt("hdBitrate", A0k);
                    A0N.setString("preferredPlayableUrlString", Avt.A06);
                    A0N.setInt(MRk.A00(22), Integer.valueOf(Avt.A00));
                    A0N.setBoolean("is_viewability_logging_eligible", 1BK.A0d());
                    GraphQLServiceFactory A002 = 2tS.A00();
                    if (str4 != null) {
                        TreeBuilderJNI A0N3 = AbF.A0N(A002, 6As.class, "Image", -41828274);
                        A0N3.setString(TraceFieldType.Uri, Avt.A04);
                        A0N.setTree("stories_photo_uri", A0N3.getResult(2JX.class, -41828274));
                        6As A022 = 2JX.A02();
                        A022.A08(Property.ICON_TEXT_FIT_WIDTH, Avt.A02);
                        A022.A08(Property.ICON_TEXT_FIT_HEIGHT, Avt.A01);
                        A0N.setTree("stories_photo_size", A022.getResult(2JX.class, -182933280));
                        A0N.setInt("story_video_width", Integer.valueOf(ixn2.A03()));
                        A0N.setInt("story_video_height", Integer.valueOf(ixn2.A02()));
                    } else {
                        6As A0N4 = GOn.A0N(A002, "Image", 796137874);
                        A0N4.setString(TraceFieldType.Uri, Avt.A04);
                        int i2 = Avt.A02;
                        A0N4.A08(Property.ICON_TEXT_FIT_WIDTH, i2);
                        int i3 = Avt.A01;
                        A0N4.A08(Property.ICON_TEXT_FIT_HEIGHT, i3);
                        A0N.setTree("stories_video_thumbnail", A0N4.getResult(2JX.class, 796137874));
                        A0N.setInt("story_video_width", Integer.valueOf(i2));
                        A0N.setInt("story_video_height", Integer.valueOf(i3));
                        6As A023 = 2JX.A02();
                        A023.A08(Property.ICON_TEXT_FIT_HEIGHT, ixn2.A02());
                        A023.A08(Property.ICON_TEXT_FIT_WIDTH, ixn2.A03());
                        A0N.setTree("stories_photo_size", A023.getResult(2JX.class, -182933280));
                    }
                    TreeBuilderJNI A0N5 = AbF.A0N(2tS.A00(), C2558Gh9.class, "Story", 332405866);
                    TreeBuilderJNI A0N6 = AbF.A0N(2tS.A00(), 6As.class, "StoryAttachment", 906223158);
                    A0N6.setTree("media", A0N.getResult(2JX.class, 1616276231));
                    A0N5.setTreeList("attachments", (Iterable) ImmutableList.of((Object) A0N6.getResult(2JX.class, 906223158)));
                    tree = A0N5.getResult(GhA.class, 332405866);
                }
                return tree;
        }
    }
}
