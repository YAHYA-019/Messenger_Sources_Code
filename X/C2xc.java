package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.credentials.UserTokenCredentials;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.dsp.core.ColorData;
import com.facebook.fbservice.results.DataFetchDisposition;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.interstitial.triggers.InterstitialTriggerContext;
import com.facebook.messaging.business.inboxads.common.InboxAdsData;
import com.facebook.messaging.business.inboxads.common.InboxAdsItem;
import com.facebook.messaging.communitymessaging.communitycontainers.model.SingleUnreadCommunityChannelMetadata;
import com.facebook.messaging.communitymessaging.communitynotificationsettings.threadsummary.model.CommunityMutedMetadata;
import com.facebook.messaging.communitymessaging.enablement.threadsummary.model.CommunityEnablementMetadata;
import com.facebook.messaging.communitymessaging.model.MessengerJoinRequestApprovalSetting;
import com.facebook.messaging.communitymessaging.takedown.threadsummary.model.CommunityTakeDownMetadata;
import com.facebook.messaging.communitymessaging.threadfull.model.ThreadFullnessState;
import com.facebook.messaging.inbox.impressiontracker.model.InboxSourceLoggingData;
import com.facebook.messaging.inbox.units.InboxTrackableItem;
import com.facebook.messaging.inbox.units.StaticUnitConfig;
import com.facebook.messaging.memories.model.MemoriesTrayPogModel;
import com.facebook.messaging.model.folders.FolderCounts;
import com.facebook.messaging.model.messages.MessageDraft;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.send.PendingSendQueueKey;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.GroupApprovalInfo;
import com.facebook.messaging.model.threads.GroupThreadData;
import com.facebook.messaging.model.threads.JoinableInfo;
import com.facebook.messaging.model.threads.NicknamesMap;
import com.facebook.messaging.model.threads.NotificationSetting;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadRtcCallInfoData;
import com.facebook.messaging.model.threads.ThreadRtcRoomInfoData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.model.threads.ThreadsCollection;
import com.facebook.messaging.montage.model.MontageBucketKey;
import com.facebook.messaging.montage.model.MontageBucketLooperLoggingItem;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.messaging.montage.model.MontageUser;
import com.facebook.messaging.presence.unifiedpresence.UnifiedPresenceViewLoggerItem;
import com.facebook.messaging.service.model.FetchMoreThreadsParams;
import com.facebook.messaging.service.model.FetchThreadListParams;
import com.facebook.messaging.service.model.FetchThreadListResult;
import com.facebook.messaging.threadview.surfaceoptions.model.MigUpButtonConfig;
import com.facebook.messaging.threadview.surfaceoptions.model.ThreadViewSurfaceOptions;
import com.facebook.messaging.threadview.surfaceoptions.model.UpButtonConfig;
import com.facebook.mig.scheme.schemes.DarkColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.presence.api.model.LightweightInteractions;
import com.facebook.presence.api.model.NoteTypeEnum;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.presence.api.model.RichStatusMention;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.facebook.ui.emoji.model.BasicEmoji;
import com.facebook.ui.emoji.model.Emoji;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.facebook.user.model.UserEmailAddress;
import com.facebook.user.model.UserFbidIdentifier;
import com.facebook.user.model.UserKey;
import com.facebook.user.model.UserMsysPkIdentifier;
import com.facebook.user.model.WorkUserForeignEntityInfo;
import com.facebook.user.profilepic.PicSquare;
import com.facebook.user.profilepic.PicSquareUrlWithSize;
import com.facebook.user.profilepic.ProfilePicUriWithFilePath;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import com.facebook.xapp.messaging.msys.threadsummary.metadata.invitestatus.CommunityInviteStatusMetadata;
import com.facebook.xapp.messaging.msys.threadsummary.metadata.requesttojoin.PendingJoinRequestsCountMetadata;
import com.facebook.xapp.messaging.msys.threadsummary.metadata.thread.MsysThreadTypeMetadata;
import com.facebook.xapp.messaging.threadview.theme.custom.model.CompositeThreadThemeInfo;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.facebook.zero.common.ZeroToken;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.2xc, reason: invalid class name */
/* loaded from: 2xc.class */
public final class C2xc implements Parcelable.Creator {
    public final int A00;

    public C2xc(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r307v0, types: [androidx.recyclerview.widget.LinearLayoutManager$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r307v10, types: [com.facebook.messaging.business.inboxads.common.InboxAdsItem, X.2UP] */
    /* JADX WARN: Type inference failed for: r307v5, types: [com.facebook.fbservice.service.OperationResult, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r307v59, types: [com.facebook.messaging.model.threads.NicknamesMap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r307v6, types: [com.facebook.fbservice.service.ServiceException, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r307v66, types: [com.facebook.mig.scheme.schemes.DarkColorScheme, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcelable parcelable;
        Integer num;
        switch (this.A00) {
            case 0:
                ?? obj = new Object();
                obj.A01 = parcel.readInt();
                obj.A00 = parcel.readInt();
                obj.A02 = parcel.readInt() == 1;
                parcelable = obj;
                break;
            case 1:
                parcelable = new UserTokenCredentials(parcel.readString(), parcel.readString());
                break;
            case 2:
                parcelable = new ViewerContext(parcel);
                break;
            case 3:
                parcelable = new CallerContext(parcel);
                break;
            case 4:
                parcelable = new ContextChain(parcel);
                break;
            case 5:
                11T.A0F(parcel, 0);
                parcelable = new ColorData(parcel.readInt(), parcel.readInt());
                break;
            case 6:
                parcelable = new DataFetchDisposition(parcel);
                break;
            case 7:
                ?? obj2 = new Object();
                obj2.success = parcel.readInt() != 0;
                obj2.resultDataString = parcel.readString();
                obj2.resultDataBundle = parcel.readBundle(obj2.getClass().getClassLoader());
                obj2.errorCode = 29B.valueOf(parcel.readString());
                obj2.errorDescription = parcel.readString();
                obj2.errorThrowable = (Throwable) parcel.readSerializable();
                parcelable = obj2;
                break;
            case 8:
                ?? exc = new Exception();
                exc.errorCode = parcel.readSerializable();
                exc.result = (OperationResult) parcel.readParcelable(OperationResult.class.getClassLoader());
                parcelable = exc;
                break;
            case 9:
                String readString = parcel.readString();
                try {
                    parcelable = RequestPriority.valueOf(readString);
                    break;
                } catch (IllegalArgumentException unused) {
                    parcelable = RequestPriority.A00;
                    0fH.A0S(RequestPriority.class, "Do not recognize priority %s. Defaulting to %s.", new Object[]{readString, "NON_INTERACTIVE"});
                    break;
                }
            case 10:
                11T.A0F(parcel, 0);
                parcelable = new InterstitialTrigger(parcel);
                break;
            case 11:
                11T.A0F(parcel, 0);
                parcelable = new InterstitialTriggerContext(parcel);
                break;
            case 12:
                ?? r307 = new 2UP(parcel);
                Parcelable readParcelable = parcel.readParcelable(InboxAdsData.class.getClassLoader());
                readParcelable.getClass();
                r307.A00 = (InboxAdsData) readParcelable;
                parcelable = r307;
                break;
            case 13:
                11T.A0F(parcel, 0);
                Parcelable.Creator creator = SingleUnreadCommunityChannelMetadata.CREATOR;
                parcelable = new SingleUnreadCommunityChannelMetadata((ThreadSummary) parcel.readParcelable(SingleUnreadCommunityChannelMetadata.class.getClassLoader()));
                break;
            case 14:
                11T.A0F(parcel, 0);
                Parcelable.Creator creator2 = CommunityMutedMetadata.CREATOR;
                parcelable = new CommunityMutedMetadata(parcel.readLong());
                break;
            case 15:
                11T.A0F(parcel, 0);
                Parcelable.Creator creator3 = CommunityEnablementMetadata.CREATOR;
                parcelable = new CommunityEnablementMetadata(C20E.valueOf(parcel.readString()), parcel.readInt() != 0);
                break;
            case 16:
                11T.A0F(parcel, 0);
                parcelable = MessengerJoinRequestApprovalSetting.valueOf(parcel.readString());
                break;
            case 17:
                11T.A0F(parcel, 0);
                Parcelable.Creator creator4 = CommunityTakeDownMetadata.CREATOR;
                parcelable = new CommunityTakeDownMetadata(C20M.valueOf(parcel.readString()));
                break;
            case 18:
                11T.A0F(parcel, 0);
                parcelable = ThreadFullnessState.valueOf(parcel.readString());
                break;
            case 19:
                11T.A0F(parcel, 0);
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    num = null;
                } else {
                    String readString3 = parcel.readString();
                    if (readString3.equals("THREAD_LIST")) {
                        num = 0S2.A00;
                    } else if (readString3.equals("SEE_MORE")) {
                        num = 0S2.A01;
                    } else if (readString3.equals("PLATFORM_TAB")) {
                        num = 0S2.A0C;
                    } else if (readString3.equals("PLATFORM_TAB_CATEGORY")) {
                        num = 0S2.A0N;
                    } else if (readString3.equals("DISCOVER_TAB_M4")) {
                        num = 0S2.A0Y;
                    } else if (readString3.equals("GROUPS_TAB")) {
                        num = 0S2.A0j;
                    } else if (readString3.equals("WORKCHAT_DISCOVERY_TAB")) {
                        num = 0S2.A0u;
                    } else if (readString3.equals("MORE_DRAWER_BROWSE")) {
                        num = 0S2.A15;
                    } else if (readString3.equals("RECENT_THREAD_LIST")) {
                        num = 0S2.A1G;
                    } else if (readString3.equals("BUSINESS_TAB")) {
                        num = 0S2.A1J;
                    } else if (readString3.equals("MESSAGE_REQUEST_LIST")) {
                        num = 0S2.A02;
                    } else if (readString3.equals("FILTERED_REQUEST_LIST")) {
                        num = 0S2.A03;
                    } else {
                        if (!readString3.equals("FOLDER_THREAD_LIST")) {
                            throw new IllegalArgumentException(readString3);
                        }
                        num = 0S2.A04;
                    }
                }
                parcelable = new InboxSourceLoggingData(readString2, num, parcel.readString());
                break;
            case 20:
                11T.A0F(parcel, 0);
                parcelable = new InboxTrackableItem(parcel);
                break;
            case 21:
                parcelable = new StaticUnitConfig(parcel);
                break;
            case 22:
                11T.A0F(parcel, 0);
                Parcelable.Creator creator5 = MemoriesTrayPogModel.Memory.CREATOR;
                parcelable = new MemoriesTrayPogModel.Memory((ImmutableList) parcel.readSerializable());
                break;
            case 23:
                parcelable = new FolderCounts(parcel);
                break;
            case 24:
                parcelable = new MessageDraft(parcel);
                break;
            case 25:
                parcelable = new ParticipantInfo(parcel);
                break;
            case 26:
                parcelable = new PendingSendQueueKey(parcel);
                break;
            case 27:
                parcelable = new ThreadKey(C1yg.valueOf(parcel.readString()), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
                break;
            case 28:
                11T.A0F(parcel, 0);
                parcelable = new GroupApprovalInfo(parcel);
                break;
            case 29:
                11T.A0F(parcel, 0);
                parcelable = new GroupThreadData(parcel);
                break;
            case 30:
                11T.A0F(parcel, 0);
                parcelable = new JoinableInfo(parcel);
                break;
            case 31:
                11T.A0F(parcel, 0);
                ImmutableMap immutableMap = null;
                String readString4 = parcel.readInt() != 0 ? parcel.readString() : null;
                if (parcel.readInt() != 0) {
                    HashMap hashMap = new HashMap();
                    C53v.A0O(parcel, hashMap);
                    immutableMap = ImmutableMap.copyOf((java.util.Map) hashMap);
                }
                ?? obj3 = new Object();
                obj3.A01 = readString4;
                obj3.A00 = immutableMap;
                parcelable = obj3;
                break;
            case 32:
                11T.A0F(parcel, 0);
                parcelable = new NotificationSetting(parcel);
                break;
            case 33:
                11T.A0F(parcel, 0);
                parcelable = new ThreadCustomization(parcel);
                break;
            case 34:
                parcelable = new ThreadParticipant(parcel);
                break;
            case 35:
                11T.A0F(parcel, 0);
                parcelable = new ThreadRtcCallInfoData(parcel);
                break;
            case 36:
                parcelable = new ThreadRtcRoomInfoData(parcel);
                break;
            case 37:
                parcelable = new ThreadSummary(parcel);
                break;
            case 38:
                11T.A0F(parcel, 0);
                parcelable = new ThreadsCollection(parcel);
                break;
            case 39:
                UserKey userKey = (UserKey) parcel.readParcelable(UserKey.class.getClassLoader());
                Parcelable readParcelable2 = parcel.readParcelable(MontageBucketKey.class.getClassLoader());
                readParcelable2.getClass();
                parcelable = new MontageBucketPreview((MontageBucketKey) readParcelable2, (MontageBucketLooperLoggingItem) parcel.readParcelable(MontageBucketLooperLoggingItem.class.getClassLoader()), (MontageCard) parcel.readParcelable(MontageCard.class.getClassLoader()), userKey, C53v.A04(parcel, MontageUser.class), parcel.readString(), parcel.readInt(), parcel.readInt(), C53v.A0S(parcel), C53v.A0S(parcel));
                break;
            case 40:
                11T.A0F(parcel, 0);
                parcelable = new UnifiedPresenceViewLoggerItem(parcel);
                break;
            case 41:
                parcelable = new FetchMoreThreadsParams(parcel);
                break;
            case 42:
                parcelable = new FetchThreadListParams(parcel);
                break;
            case 43:
                parcelable = new FetchThreadListResult(parcel);
                break;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                parcelable = new MigUpButtonConfig(parcel);
                break;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                parcelable = new ThreadViewSurfaceOptions(parcel);
                break;
            case 46:
                parcelable = new UpButtonConfig(parcel);
                break;
            case ActionId.ON_START_END /* 47 */:
                Parcelable parcelable2 = DarkColorScheme.A00;
                parcelable = parcelable2;
                if (parcelable2 == null) {
                    ?? obj4 = new Object();
                    DarkColorScheme.A00 = obj4;
                    parcelable = obj4;
                    break;
                }
                break;
            case ActionId.QUEUED /* 48 */:
                parcelable = LightColorScheme.A00();
                break;
            case ActionId.IN_PROGRESS /* 49 */:
                11T.A0F(parcel, 0);
                parcelable = NoteTypeEnum.valueOf(parcel.readString());
                break;
            case 50:
                11T.A0F(parcel, 0);
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                Emoji emoji = (Emoji) parcel.readParcelable(RichStatus.class.getClassLoader());
                String readString5 = parcel.readString();
                Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                long readLong3 = parcel.readLong();
                boolean z = parcel.readInt() != 0;
                float readFloat = parcel.readFloat();
                long readLong4 = parcel.readLong();
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                double readDouble = parcel.readDouble();
                String readString6 = parcel.readString();
                NoteTypeEnum noteTypeEnum = (NoteTypeEnum) NoteTypeEnum.CREATOR.createFromParcel(parcel);
                long readLong5 = parcel.readLong();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                long readLong6 = parcel.readLong();
                String readString9 = parcel.readString();
                long readLong7 = parcel.readLong();
                long readLong8 = parcel.readLong();
                boolean z4 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(RichStatusMention.CREATOR.createFromParcel(parcel));
                }
                parcelable = new RichStatus((LightweightInteractions) (parcel.readInt() == 0 ? null : LightweightInteractions.CREATOR.createFromParcel(parcel)), noteTypeEnum, emoji, valueOf, readString5, readString6, readString7, readString8, readString9, arrayList, readDouble, readFloat, readLong, readLong2, readLong3, readLong4, readLong5, readLong6, readLong7, readLong8, z, z2, z3, z4, parcel.readInt() != 0);
                break;
            case ActionId.UNKNOWN /* 51 */:
                11T.A0F(parcel, 0);
                parcelable = new QuickPromotionDefinition(parcel);
                break;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                parcelable = new BasicEmoji(parcel);
                break;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                parcelable = new Name(parcel);
                break;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                parcelable = new User(parcel);
                break;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                parcelable = new UserEmailAddress(parcel);
                break;
            case ActionId.QUEUEING_FAIL /* 56 */:
                parcelable = new UserFbidIdentifier(parcel);
                break;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                parcelable = new UserKey(1Js.valueOf(parcel.readString()), parcel.readString());
                break;
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                parcelable = new UserMsysPkIdentifier(parcel);
                break;
            case ActionId.PHOTO_CAPTURED /* 59 */:
                parcelable = new WorkUserForeignEntityInfo(parcel);
                break;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                parcelable = new PicSquare(parcel);
                break;
            case ActionId.COUNTER /* 61 */:
                parcelable = new PicSquareUrlWithSize(parcel);
                break;
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                parcelable = new ProfilePicUriWithFilePath(parcel);
                break;
            case 63:
                11T.A0F(parcel, 0);
                Parcelable.Creator creator6 = Capabilities.CREATOR;
                byte[] createByteArray = parcel.createByteArray();
                if (createByteArray == null) {
                    createByteArray = new byte[0];
                }
                int length = createByteArray.length;
                if (length == 0) {
                    parcelable = Capabilities.A02;
                    break;
                } else {
                    BitSet bitSet = new BitSet(length * 8);
                    int i2 = 0;
                    do {
                        byte b = createByteArray[i2];
                        int i3 = 0;
                        do {
                            if (((1 << i3) & b) != 0) {
                                bitSet.set((i2 * 8) + i3);
                            }
                            i3++;
                        } while (i3 < 8);
                        i2++;
                    } while (i2 < length);
                    parcelable = new Capabilities(bitSet);
                    break;
                }
            case 64:
                11T.A0F(parcel, 0);
                0QO r0 = new 0QO(0);
                parcel.readMap(r0, HeterogeneousMap.A01.getClass().getClassLoader());
                parcelable = new HeterogeneousMap(r0);
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                parcelable = new ParcelableSecondaryData(C53v.A05(parcel));
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                11T.A0F(parcel, 0);
                Parcelable.Creator creator7 = CommunityInviteStatusMetadata.CREATOR;
                parcelable = new CommunityInviteStatusMetadata(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt());
                break;
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                11T.A0F(parcel, 0);
                Parcelable.Creator creator8 = PendingJoinRequestsCountMetadata.CREATOR;
                parcelable = new PendingJoinRequestsCountMetadata(parcel.readLong());
                break;
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                11T.A0F(parcel, 0);
                Parcelable.Creator creator9 = MsysThreadTypeMetadata.CREATOR;
                parcelable = new MsysThreadTypeMetadata(parcel.readInt());
                break;
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                parcelable = new CompositeThreadThemeInfo(parcel);
                break;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                parcelable = new ThreadThemeInfo(parcel);
                break;
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                parcelable = new ZeroToken(parcel);
                break;
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                int A00 = 3rS.A00(parcel);
                String str = null;
                PendingIntent pendingIntent = null;
                ConnectionResult connectionResult = null;
                int i4 = 0;
                while (parcel.dataPosition() < A00) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 1) {
                        3rS.A0C(parcel, readInt2, 4);
                        i4 = parcel.readInt();
                    } else if (c == 2) {
                        str = 3rS.A05(parcel, readInt2);
                    } else if (c == 3) {
                        pendingIntent = (PendingIntent) 3rS.A04(parcel, PendingIntent.CREATOR, readInt2);
                    } else if (c != 4) {
                        3rS.A09(parcel, readInt2);
                    } else {
                        connectionResult = (ConnectionResult) 3rS.A04(parcel, ConnectionResult.CREATOR, readInt2);
                    }
                }
                3rS.A08(parcel, A00);
                parcelable = new Status(pendingIntent, connectionResult, str, i4);
                break;
            case ActionId.INTENT_MAPPED /* 73 */:
                int A002 = 3rS.A00(parcel);
                long j = -1;
                int i5 = 0;
                String str2 = null;
                while (parcel.dataPosition() < A002) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 1) {
                        str2 = 3rS.A05(parcel, readInt3);
                    } else if (c2 == 2) {
                        3rS.A0C(parcel, readInt3, 4);
                        i5 = parcel.readInt();
                    } else if (c2 != 3) {
                        3rS.A09(parcel, readInt3);
                    } else {
                        3rS.A0C(parcel, readInt3, 8);
                        j = parcel.readLong();
                    }
                }
                3rS.A08(parcel, A002);
                parcelable = new Feature(str2, i5, j);
                break;
            default:
                return null;
        }
        synchronized (0C9.A00) {
        }
        return parcelable;
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new LinearLayoutManager.SavedState[i];
            case 1:
                return new UserTokenCredentials[i];
            case 2:
                return new ViewerContext[i];
            case 3:
                return new CallerContext[i];
            case 4:
                return new ContextChain[i];
            case 5:
                return new ColorData[i];
            case 6:
                return new DataFetchDisposition[i];
            case 7:
                return new OperationResult[i];
            case 8:
                return new ServiceException[i];
            case 9:
                return new RequestPriority[i];
            case 10:
                return new InterstitialTrigger[i];
            case 11:
                return new InterstitialTriggerContext[i];
            case 12:
                return new InboxAdsItem[i];
            case 13:
                return new SingleUnreadCommunityChannelMetadata[i];
            case 14:
                return new CommunityMutedMetadata[i];
            case 15:
                return new CommunityEnablementMetadata[i];
            case 16:
                return new MessengerJoinRequestApprovalSetting[i];
            case 17:
                return new CommunityTakeDownMetadata[i];
            case 18:
                return new ThreadFullnessState[i];
            case 19:
                return new InboxSourceLoggingData[i];
            case 20:
                return new InboxTrackableItem[i];
            case 21:
                return new StaticUnitConfig[i];
            case 22:
                return new MemoriesTrayPogModel.Memory[i];
            case 23:
                return new FolderCounts[i];
            case 24:
                return new MessageDraft[i];
            case 25:
                return new ParticipantInfo[i];
            case 26:
                return new PendingSendQueueKey[i];
            case 27:
                return new ThreadKey[i];
            case 28:
                return new GroupApprovalInfo[i];
            case 29:
                return new GroupThreadData[i];
            case 30:
                return new JoinableInfo[i];
            case 31:
                return new NicknamesMap[i];
            case 32:
                return new NotificationSetting[i];
            case 33:
                return new ThreadCustomization[i];
            case 34:
                return new ThreadParticipant[i];
            case 35:
                return new ThreadRtcCallInfoData[i];
            case 36:
                return new ThreadRtcRoomInfoData[i];
            case 37:
                return new ThreadSummary[i];
            case 38:
                return new ThreadsCollection[i];
            case 39:
                return new MontageBucketPreview[i];
            case 40:
                return new UnifiedPresenceViewLoggerItem[i];
            case 41:
                return new FetchMoreThreadsParams[i];
            case 42:
                return new FetchThreadListParams[i];
            case 43:
                return new FetchThreadListResult[i];
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return new MigUpButtonConfig[i];
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                return new ThreadViewSurfaceOptions[i];
            case 46:
                return new UpButtonConfig[i];
            case ActionId.ON_START_END /* 47 */:
                return new DarkColorScheme[i];
            case ActionId.QUEUED /* 48 */:
                return new LightColorScheme[i];
            case ActionId.IN_PROGRESS /* 49 */:
                return new NoteTypeEnum[i];
            case 50:
                return new RichStatus[i];
            case ActionId.UNKNOWN /* 51 */:
                return new QuickPromotionDefinition[i];
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                return new Emoji[i];
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                return new Name[i];
            case ActionId.QUEUEING_BEGIN /* 54 */:
                return new User[i];
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                return new UserEmailAddress[i];
            case ActionId.QUEUEING_FAIL /* 56 */:
                return new UserFbidIdentifier[i];
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                return new UserKey[i];
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                return new UserMsysPkIdentifier[i];
            case ActionId.PHOTO_CAPTURED /* 59 */:
                return new WorkUserForeignEntityInfo[i];
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                return new PicSquare[i];
            case ActionId.COUNTER /* 61 */:
                return new PicSquareUrlWithSize[i];
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                return new ProfilePicUriWithFilePath[i];
            case 63:
                return new Capabilities[i];
            case 64:
                return new HeterogeneousMap[i];
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                return new ParcelableSecondaryData[i];
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                return new CommunityInviteStatusMetadata[i];
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                return new PendingJoinRequestsCountMetadata[i];
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                return new MsysThreadTypeMetadata[i];
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                return new CompositeThreadThemeInfo[i];
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                return new ThreadThemeInfo[i];
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                return new ZeroToken[0];
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                return new Status[i];
            case ActionId.INTENT_MAPPED /* 73 */:
                return new Feature[i];
            default:
                return new Object[0];
        }
    }
}
