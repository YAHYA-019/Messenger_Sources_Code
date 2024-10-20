package X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.acra.constants.ActionId;
import com.facebook.fblibraries.fblogin.FirstPartySsoSessionInfo;
import com.facebook.fblibraries.fblogin.SsoSource;
import com.facebook.fbtrace.FbTraceNode;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.communitymessaging.notify.analytics.CommunityMessagingNotificationsLoggerModel;
import com.facebook.messaging.communitymessaging.selectivesync.threadlist.eventhandler.SelectiveSyncThreadListHandler$SavedSyncStateData;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.events.model.EventData;
import com.facebook.messaging.inbox.units.InboxLoggingExtra;
import com.facebook.messaging.memories.model.MemoriesTrayPogModel;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.attachment.AttachmentImageMap;
import com.facebook.messaging.model.attachment.AudioData;
import com.facebook.messaging.model.attachment.ImageData;
import com.facebook.messaging.model.attachment.ImageUrl;
import com.facebook.messaging.model.attachment.VideoData;
import com.facebook.messaging.model.attribution.ContentAppAttribution;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.GroupThreadAssociatedFbGroup;
import com.facebook.messaging.model.threads.GroupThreadAssociatedObject;
import com.facebook.messaging.model.threads.ThreadConnectivityData;
import com.facebook.messaging.montage.forked.viewer.model.StoryBackgroundInfo;
import com.facebook.messaging.montage.model.MontageBucketKey;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.messaging.montage.model.MontageNoteBucketPreview;
import com.facebook.messaging.montage.model.MontageUser;
import com.facebook.messaging.montage.model.MontageViewerContent;
import com.facebook.messaging.montage.model.montageattribution.MontageAttributionData;
import com.facebook.messaging.montage.model.montagemetadata.MontageActorInfo;
import com.facebook.messaging.montage.model.montagemetadata.MontageMetadata;
import com.facebook.messaging.navigation.home.drawer.fragment.HomeDrawerSwipeStateController$DrawerSwipeAction;
import com.facebook.messaging.navigation.home.drawer.model.CommunityCreationDrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.FolderNameDrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.SpecialDrawerFolderKey;
import com.facebook.messaging.threadview.surfaceoptions.model.CustomUpButtonConfig;
import com.facebook.messaging.threadview.surfaceoptions.model.DismissConfig;
import com.facebook.messaging.tray.model.metadata.memories.TrayListItemMemoriesMetadata;
import com.facebook.messaging.tray.model.metadata.montage.TrayListItemMontageMetadata;
import com.facebook.messaging.tray.model.metadata.notes.TrayListItemNotesMetadata;
import com.facebook.messaging.tray.model.metadata.ranklogging.TrayListItemRankLoggingMetadata;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.facebook.user.model.User;
import com.facebook.user.model.WorkUserInfo;
import com.facebook.zero.common.ZeroUrlRewriteRule;
import com.facebook.zero.common.util.CarrierAndSimMccMnc;
import com.facebook.zero.protocol.params.FetchZeroTokenRequestParams;
import com.facebook.zero.protocol.params.ZeroRequestBaseParams;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzk;
import java.util.LinkedHashMap;

/* renamed from: X.4Ny, reason: invalid class name */
/* loaded from: 4Ny.class */
public final class C4Ny implements Parcelable.Creator {
    public final int A00;

    public C4Ny(int i) {
        this.A00 = i;
    }

    public static void A00(Parcel parcel, GetServiceRequest getServiceRequest, int i) {
        int A01 = AbstractC01153q8.A01(parcel, 20293);
        AbstractC01153q8.A04(parcel, 1, getServiceRequest.A08);
        AbstractC01153q8.A04(parcel, 2, getServiceRequest.A09);
        AbstractC01153q8.A04(parcel, 3, getServiceRequest.A0A);
        AbstractC01153q8.A08(parcel, getServiceRequest.A03, 4);
        IBinder iBinder = getServiceRequest.A02;
        if (iBinder != null) {
            int A012 = AbstractC01153q8.A01(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            AbstractC01153q8.A03(parcel, A012);
        }
        AbstractC01153q8.A0C(parcel, getServiceRequest.A07, 6, i);
        AbstractC01153q8.A02(getServiceRequest.A01, parcel, 7);
        AbstractC01153q8.A07(parcel, getServiceRequest.A00, 8, i);
        AbstractC01153q8.A0C(parcel, getServiceRequest.A05, 10, i);
        AbstractC01153q8.A0C(parcel, getServiceRequest.A06, 11, i);
        AbstractC01153q8.A06(parcel, 12, getServiceRequest.A0D);
        AbstractC01153q8.A04(parcel, 13, getServiceRequest.A0B);
        AbstractC01153q8.A06(parcel, 14, getServiceRequest.A04);
        AbstractC01153q8.A08(parcel, getServiceRequest.A0C, 15);
        AbstractC01153q8.A03(parcel, A01);
    }

    /* JADX WARN: Type inference failed for: r305v31, types: [java.lang.Object, com.google.android.gms.common.internal.zzk] */
    /* JADX WARN: Type inference failed for: r305v33, types: [com.facebook.zero.protocol.params.FetchZeroTokenRequestParams, com.facebook.zero.protocol.params.ZeroRequestBaseParams] */
    /* JADX WARN: Type inference failed for: r305v50, types: [com.facebook.messaging.model.attachment.VideoData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r305v51, types: [com.facebook.messaging.model.attachment.ImageUrl, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcelable valueOf;
        int A01;
        int dataPosition;
        switch (this.A00) {
            case 0:
                valueOf = new SwipeRefreshLayout.SavedState(parcel);
                break;
            case 1:
                valueOf = new FirstPartySsoSessionInfo(parcel);
                break;
            case 2:
                valueOf = new SsoSource(parcel);
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if ("invalid_id".equals(readString)) {
                    valueOf = FbTraceNode.A03;
                    break;
                } else {
                    valueOf = new FbTraceNode(readString, readString2, readString3);
                    break;
                }
            case 4:
                11T.A0F(parcel, 0);
                valueOf = new CallToAction(parcel);
                break;
            case 5:
                valueOf = new Community(parcel);
                break;
            case 6:
                11T.A0F(parcel, 0);
                LinkedHashMap linkedHashMap = null;
                Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Long valueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString4 = parcel.readString();
                BOA valueOf5 = BOA.valueOf(parcel.readString());
                String readString5 = parcel.readString();
                BNr valueOf6 = BNr.valueOf(parcel.readString());
                String readString6 = parcel.readString();
                Long valueOf7 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                    }
                }
                valueOf = new CommunityMessagingNotificationsLoggerModel(valueOf6, valueOf5, valueOf8, valueOf2, valueOf3, valueOf4, valueOf7, readString4, readString5, readString6, readString7, readString8, readString9, linkedHashMap);
                break;
            case 7:
                11T.A0F(parcel, 0);
                long readLong = parcel.readLong();
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    linkedHashMap2.put(1Hb.valueOf(parcel.readString()), Long.valueOf(parcel.readLong()));
                }
                valueOf = new SelectiveSyncThreadListHandler$SavedSyncStateData(linkedHashMap2, readLong);
                break;
            case 8:
                valueOf = new EventData(parcel);
                break;
            case 9:
                11T.A0F(parcel, 0);
                valueOf = new InboxLoggingExtra(parcel);
                break;
            case 10:
                valueOf = new Attachment(parcel);
                break;
            case 11:
                valueOf = new AttachmentImageMap(parcel);
                break;
            case 12:
                valueOf = new AudioData(parcel);
                break;
            case 13:
                valueOf = new ImageData(parcel);
                break;
            case 14:
                ?? obj = new Object();
                obj.A01 = parcel.readInt();
                obj.A00 = parcel.readInt();
                obj.A02 = parcel.readString();
                valueOf = obj;
                break;
            case 15:
                ?? obj2 = new Object();
                obj2.A08 = parcel.readInt();
                obj2.A05 = parcel.readInt();
                obj2.A07 = parcel.readInt();
                obj2.A03 = parcel.readInt();
                obj2.A02 = parcel.readInt();
                obj2.A06 = parcel.readInt();
                obj2.A0D = C48g.valueOf(parcel.readString());
                obj2.A0B = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                obj2.A0G = parcel.readString();
                obj2.A0C = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                obj2.A0A = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                obj2.A0F = parcel.readString();
                obj2.A01 = parcel.readInt();
                obj2.A04 = parcel.readInt();
                obj2.A00 = parcel.readInt();
                obj2.A09 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                obj2.A0E = parcel.readString();
                valueOf = obj2;
                break;
            case 16:
                valueOf = new ContentAppAttribution(parcel);
                break;
            case 17:
                valueOf = new Message(parcel);
                break;
            case 18:
                11T.A0F(parcel, 0);
                valueOf = new GroupThreadAssociatedFbGroup(parcel);
                break;
            case 19:
                11T.A0F(parcel, 0);
                valueOf = new GroupThreadAssociatedObject(parcel);
                break;
            case 20:
                valueOf = new ThreadConnectivityData(parcel);
                break;
            case 21:
                valueOf = new StoryBackgroundInfo(parcel);
                break;
            case 22:
                valueOf = new MontageBucketKey(parcel.readLong());
                break;
            case 23:
                valueOf = new MontageCard(parcel);
                break;
            case 24:
                11T.A0F(parcel, 0);
                valueOf = new MontageNoteBucketPreview((RichStatus) parcel.readParcelable(MontageNoteBucketPreview.class.getClassLoader()), (User) parcel.readParcelable(MontageNoteBucketPreview.class.getClassLoader()), C2fd.valueOf(parcel.readString()));
                break;
            case 25:
                valueOf = new MontageUser(parcel);
                break;
            case 26:
                11T.A0F(parcel, 0);
                valueOf = new MontageViewerContent((MontageBucketPreview) parcel.readParcelable(MontageViewerContent.class.getClassLoader()), (MontageNoteBucketPreview) (parcel.readInt() == 0 ? null : MontageNoteBucketPreview.CREATOR.createFromParcel(parcel)));
                break;
            case 27:
                valueOf = new MontageAttributionData(parcel);
                break;
            case 28:
                valueOf = new MontageActorInfo(parcel);
                break;
            case 29:
                valueOf = new MontageMetadata(parcel);
                break;
            case 30:
                11T.A0F(parcel, 0);
                valueOf = HomeDrawerSwipeStateController$DrawerSwipeAction.valueOf(parcel.readString());
                break;
            case 31:
                11T.A0F(parcel, 0);
                valueOf = new CommunityCreationDrawerFolderKey(parcel.readString());
                break;
            case 32:
                11T.A0F(parcel, 0);
                valueOf = new FolderNameDrawerFolderKey(1F9.valueOf(parcel.readString()));
                break;
            case 33:
                11T.A0F(parcel, 0);
                String readString10 = parcel.readString();
                if (!readString10.equals("MARKETPLACE")) {
                    throw new IllegalArgumentException(readString10);
                }
                valueOf = new SpecialDrawerFolderKey(0S2.A00);
                break;
            case 34:
                valueOf = new CustomUpButtonConfig(parcel);
                break;
            case 35:
                valueOf = new DismissConfig(parcel);
                break;
            case 36:
                11T.A0F(parcel, 0);
                Parcelable.Creator creator = TrayListItemMemoriesMetadata.CREATOR;
                valueOf = new TrayListItemMemoriesMetadata((MemoriesTrayPogModel) parcel.readParcelable(TrayListItemMemoriesMetadata.class.getClassLoader()));
                break;
            case 37:
                11T.A0F(parcel, 0);
                Parcelable.Creator creator2 = TrayListItemMontageMetadata.CREATOR;
                valueOf = new TrayListItemMontageMetadata((MontageBucketPreview) parcel.readParcelable(TrayListItemMontageMetadata.class.getClassLoader()));
                break;
            case 38:
                11T.A0F(parcel, 0);
                Parcelable.Creator creator3 = TrayListItemNotesMetadata.CREATOR;
                valueOf = new TrayListItemNotesMetadata((RichStatus) parcel.readParcelable(TrayListItemNotesMetadata.class.getClassLoader()));
                break;
            case 39:
                11T.A0F(parcel, 0);
                Parcelable.Creator creator4 = TrayListItemRankLoggingMetadata.CREATOR;
                valueOf = new TrayListItemRankLoggingMetadata((RankingLoggingItem) parcel.readParcelable(TrayListItemRankLoggingMetadata.class.getClassLoader()));
                break;
            case 40:
                11T.A0F(parcel, 0);
                Parcelable readParcelable = parcel.readParcelable(MigColorScheme.class.getClassLoader());
                if (readParcelable == null) {
                    throw 1BK.A0h();
                }
                valueOf = new DelegatingMigColorScheme((MigColorScheme) readParcelable);
                break;
            case 41:
                11T.A0F(parcel, 0);
                String readString11 = parcel.readString();
                if (readString11 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                Object readValue = parcel.readValue(!readString11.equals("NULL") ? Class.forName(readString11).getClassLoader() : null);
                Parcelable A0C = 1BL.A0C(parcel, ZonePolicy.class);
                if (A0C == null) {
                    throw AnonymousClass001.A0L("Required value was null.");
                }
                ZonePolicy zonePolicy = (ZonePolicy) A0C;
                String readString12 = parcel.readString();
                if (readString12 == null) {
                    throw AnonymousClass001.A0L("Required value was null.");
                }
                valueOf = new ZonedValue(zonePolicy, readValue, readString12);
                break;
            case 42:
                11T.A0F(parcel, 0);
                valueOf = new QuickPromotionDefinition.Action(parcel);
                break;
            case 43:
                11T.A0F(parcel, 0);
                valueOf = new QuickPromotionDefinition.BooleanFilter(parcel);
                break;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                11T.A0F(parcel, 0);
                valueOf = new QuickPromotionDefinition.ContextualFilter(parcel);
                break;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                11T.A0F(parcel, 0);
                valueOf = new QuickPromotionDefinition.Creative(parcel);
                break;
            case 46:
                11T.A0F(parcel, 0);
                valueOf = new QuickPromotionDefinition.FilterClause(parcel);
                break;
            case ActionId.ON_START_END /* 47 */:
                11T.A0F(parcel, 0);
                valueOf = new QuickPromotionDefinition.ImageParameters(parcel);
                break;
            case ActionId.QUEUED /* 48 */:
                valueOf = new WorkUserInfo(parcel);
                break;
            case ActionId.IN_PROGRESS /* 49 */:
                valueOf = new ZeroUrlRewriteRule(parcel);
                break;
            case 50:
                valueOf = new CarrierAndSimMccMnc(parcel);
                break;
            case ActionId.UNKNOWN /* 51 */:
                valueOf = new CarrierAndSimMccMnc.MccMncPair(parcel);
                break;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                ?? zeroRequestBaseParams = new ZeroRequestBaseParams(parcel);
                zeroRequestBaseParams.A03 = parcel.readByte() != 0;
                zeroRequestBaseParams.A02 = parcel.readByte() != 0;
                zeroRequestBaseParams.A00 = parcel.readString();
                zeroRequestBaseParams.A01 = parcel.readString();
                valueOf = zeroRequestBaseParams;
                break;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                int A00 = 3rS.A00(parcel);
                int i3 = 0;
                boolean z = false;
                boolean z2 = false;
                int i4 = 0;
                int i5 = 0;
                while (parcel.dataPosition() < A00) {
                    int readInt3 = parcel.readInt();
                    char c = (char) readInt3;
                    if (c == 1) {
                        3rS.A0A(parcel, readInt3);
                        i3 = parcel.readInt();
                    } else if (c == 2) {
                        z = 3rS.A0D(parcel, readInt3);
                    } else if (c == 3) {
                        z2 = 3rS.A0D(parcel, readInt3);
                    } else if (c == 4) {
                        3rS.A0C(parcel, readInt3, 4);
                        i4 = parcel.readInt();
                    } else if (c != 5) {
                        3rS.A09(parcel, readInt3);
                    } else {
                        3rS.A0A(parcel, readInt3);
                        i5 = parcel.readInt();
                    }
                }
                3rS.A08(parcel, A00);
                valueOf = new RootTelemetryConfiguration(i3, i4, i5, z, z2);
                break;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                int A002 = 3rS.A00(parcel);
                Bundle bundle = null;
                Feature[] featureArr = null;
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
                int i6 = 0;
                while (parcel.dataPosition() < A002) {
                    int readInt4 = parcel.readInt();
                    char c2 = (char) readInt4;
                    if (c2 == 1) {
                        bundle = 3rS.A02(parcel, readInt4);
                    } else if (c2 == 2) {
                        featureArr = (Feature[]) 3rS.A0F(parcel, Feature.CREATOR, readInt4);
                    } else if (c2 == 3) {
                        3rS.A0A(parcel, readInt4);
                        i6 = parcel.readInt();
                    } else if (c2 != 4) {
                        3rS.A09(parcel, readInt4);
                    } else {
                        connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) 3rS.A04(parcel, ConnectionTelemetryConfiguration.CREATOR, readInt4);
                    }
                }
                3rS.A08(parcel, A002);
                ?? obj3 = new Object();
                obj3.A01 = bundle;
                obj3.A03 = featureArr;
                obj3.A00 = i6;
                obj3.A02 = connectionTelemetryConfiguration;
                valueOf = obj3;
                break;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                int A003 = 3rS.A00(parcel);
                RootTelemetryConfiguration rootTelemetryConfiguration = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z3 = false;
                boolean z4 = false;
                int i7 = 0;
                while (parcel.dataPosition() < A003) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            rootTelemetryConfiguration = (RootTelemetryConfiguration) 3rS.A04(parcel, RootTelemetryConfiguration.CREATOR, readInt5);
                            continue;
                        case 2:
                            z3 = 3rS.A0D(parcel, readInt5);
                            continue;
                        case 3:
                            z4 = 3rS.A0D(parcel, readInt5);
                            continue;
                        case 4:
                            A01 = 3rS.A01(parcel, readInt5);
                            dataPosition = parcel.dataPosition();
                            if (A01 == 0) {
                                iArr = null;
                                break;
                            } else {
                                iArr = parcel.createIntArray();
                                break;
                            }
                        case 5:
                            3rS.A0A(parcel, readInt5);
                            i7 = parcel.readInt();
                            continue;
                        case 6:
                            A01 = 3rS.A01(parcel, readInt5);
                            dataPosition = parcel.dataPosition();
                            if (A01 == 0) {
                                iArr2 = null;
                                break;
                            } else {
                                iArr2 = parcel.createIntArray();
                                break;
                            }
                        default:
                            3rS.A09(parcel, readInt5);
                            continue;
                    }
                    parcel.setDataPosition(dataPosition + A01);
                }
                3rS.A08(parcel, A003);
                valueOf = new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, iArr, iArr2, i7, z3, z4);
                break;
            case ActionId.QUEUEING_FAIL /* 56 */:
                int A004 = 3rS.A00(parcel);
                Scope[] scopeArr = GetServiceRequest.A0F;
                Bundle bundle2 = new Bundle();
                Feature[] featureArr2 = GetServiceRequest.A0E;
                String str = null;
                Feature[] featureArr3 = featureArr2;
                IBinder iBinder = null;
                Account account = null;
                String str2 = null;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                boolean z5 = false;
                int i11 = 0;
                boolean z6 = false;
                while (parcel.dataPosition() < A004) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            3rS.A0A(parcel, readInt6);
                            i8 = parcel.readInt();
                            break;
                        case 2:
                            3rS.A0A(parcel, readInt6);
                            i9 = parcel.readInt();
                            break;
                        case 3:
                            3rS.A0A(parcel, readInt6);
                            i10 = parcel.readInt();
                            break;
                        case 4:
                            str = 3rS.A05(parcel, readInt6);
                            break;
                        case 5:
                            iBinder = 3rS.A03(parcel, readInt6);
                            break;
                        case 6:
                            scopeArr = (Scope[]) 3rS.A0F(parcel, Scope.CREATOR, readInt6);
                            break;
                        case 7:
                            bundle2 = 3rS.A02(parcel, readInt6);
                            break;
                        case '\b':
                            account = (Account) 3rS.A04(parcel, Account.CREATOR, readInt6);
                            break;
                        case '\t':
                        default:
                            3rS.A09(parcel, readInt6);
                            break;
                        case '\n':
                            featureArr2 = (Feature[]) 3rS.A0F(parcel, Feature.CREATOR, readInt6);
                            break;
                        case 11:
                            featureArr3 = (Feature[]) 3rS.A0F(parcel, Feature.CREATOR, readInt6);
                            break;
                        case '\f':
                            z5 = 3rS.A0D(parcel, readInt6);
                            break;
                        case '\r':
                            3rS.A0A(parcel, readInt6);
                            i11 = parcel.readInt();
                            break;
                        case 14:
                            z6 = 3rS.A0D(parcel, readInt6);
                            break;
                        case 15:
                            str2 = 3rS.A05(parcel, readInt6);
                            break;
                    }
                }
                3rS.A08(parcel, A004);
                valueOf = new GetServiceRequest(account, bundle2, iBinder, str, str2, featureArr2, featureArr3, scopeArr, i8, i9, i10, i11, z5, z6);
                break;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                int A005 = 3rS.A00(parcel);
                int i12 = 0;
                PendingIntent pendingIntent = null;
                String str3 = null;
                int i13 = 0;
                while (parcel.dataPosition() < A005) {
                    int readInt7 = parcel.readInt();
                    char c3 = (char) readInt7;
                    if (c3 == 1) {
                        3rS.A0A(parcel, readInt7);
                        i12 = parcel.readInt();
                    } else if (c3 == 2) {
                        3rS.A0A(parcel, readInt7);
                        i13 = parcel.readInt();
                    } else if (c3 == 3) {
                        pendingIntent = (PendingIntent) 3rS.A04(parcel, PendingIntent.CREATOR, readInt7);
                    } else if (c3 != 4) {
                        3rS.A09(parcel, readInt7);
                    } else {
                        str3 = 3rS.A05(parcel, readInt7);
                    }
                }
                3rS.A08(parcel, A005);
                valueOf = new ConnectionResult(pendingIntent, str3, i12, i13);
                break;
            default:
                return null;
        }
        synchronized (0C9.A00) {
        }
        return valueOf;
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new SwipeRefreshLayout.SavedState[i];
            case 1:
                return new FirstPartySsoSessionInfo[i];
            case 2:
                return new SsoSource[i];
            case 3:
                return new FbTraceNode[i];
            case 4:
                return new CallToAction[i];
            case 5:
                return new Community[i];
            case 6:
                return new CommunityMessagingNotificationsLoggerModel[i];
            case 7:
                return new SelectiveSyncThreadListHandler$SavedSyncStateData[i];
            case 8:
                return new EventData[i];
            case 9:
                return new InboxLoggingExtra[i];
            case 10:
                return new Attachment[i];
            case 11:
                return new AttachmentImageMap[i];
            case 12:
                return new AudioData[i];
            case 13:
                return new ImageData[i];
            case 14:
                return new ImageUrl[i];
            case 15:
                return new VideoData[i];
            case 16:
                return new ContentAppAttribution[i];
            case 17:
                return new Message[i];
            case 18:
                return new GroupThreadAssociatedFbGroup[i];
            case 19:
                return new GroupThreadAssociatedObject[i];
            case 20:
                return new ThreadConnectivityData[i];
            case 21:
                return new StoryBackgroundInfo[i];
            case 22:
                return new MontageBucketKey[i];
            case 23:
                return new MontageCard[i];
            case 24:
                return new MontageNoteBucketPreview[i];
            case 25:
                return new MontageUser[i];
            case 26:
                return new MontageViewerContent[i];
            case 27:
                return new MontageAttributionData[i];
            case 28:
                return new MontageActorInfo[i];
            case 29:
                return new MontageMetadata[i];
            case 30:
                return new HomeDrawerSwipeStateController$DrawerSwipeAction[i];
            case 31:
                return new CommunityCreationDrawerFolderKey[i];
            case 32:
                return new FolderNameDrawerFolderKey[i];
            case 33:
                return new SpecialDrawerFolderKey[i];
            case 34:
                return new CustomUpButtonConfig[i];
            case 35:
                return new DismissConfig[i];
            case 36:
                return new TrayListItemMemoriesMetadata[i];
            case 37:
                return new TrayListItemMontageMetadata[i];
            case 38:
                return new TrayListItemNotesMetadata[i];
            case 39:
                return new TrayListItemRankLoggingMetadata[i];
            case 40:
                return new DelegatingMigColorScheme[i];
            case 41:
                return new ZonedValue[i];
            case 42:
                return new QuickPromotionDefinition.Action[i];
            case 43:
                return new QuickPromotionDefinition.BooleanFilter[i];
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return new QuickPromotionDefinition.ContextualFilter[i];
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                return new QuickPromotionDefinition.Creative[i];
            case 46:
                return new QuickPromotionDefinition.FilterClause[i];
            case ActionId.ON_START_END /* 47 */:
                return new QuickPromotionDefinition.ImageParameters[i];
            case ActionId.QUEUED /* 48 */:
                return new WorkUserInfo[i];
            case ActionId.IN_PROGRESS /* 49 */:
                return new ZeroUrlRewriteRule[i];
            case 50:
                return new CarrierAndSimMccMnc[i];
            case ActionId.UNKNOWN /* 51 */:
                return new CarrierAndSimMccMnc.MccMncPair[i];
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                return new FetchZeroTokenRequestParams[i];
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                return new RootTelemetryConfiguration[i];
            case ActionId.QUEUEING_BEGIN /* 54 */:
                return new zzk[i];
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                return new ConnectionTelemetryConfiguration[i];
            case ActionId.QUEUEING_FAIL /* 56 */:
                return new GetServiceRequest[i];
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                return new ConnectionResult[i];
            default:
                return new Object[0];
        }
    }
}
