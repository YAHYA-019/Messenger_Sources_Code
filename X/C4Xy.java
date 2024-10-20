package X;

import com.facebook.acra.constants.ActionId;
import java.util.HashSet;

/* renamed from: X.4Xy, reason: invalid class name */
/* loaded from: 4Xy.class */
public final class C4Xy extends HashSet {
    public final int A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Integer] */
    public C4Xy(int i) {
        Long l;
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
            case 46:
            case ActionId.ON_START_END /* 47 */:
            case ActionId.QUEUED /* 48 */:
            case ActionId.IN_PROGRESS /* 49 */:
            case 50:
            case ActionId.UNKNOWN /* 51 */:
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
            case ActionId.QUEUEING_BEGIN /* 54 */:
            case ActionId.QUEUEING_SUCCESS /* 55 */:
            case ActionId.QUEUEING_FAIL /* 56 */:
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
            case ActionId.PHOTO_CAPTURED /* 59 */:
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
            case ActionId.COUNTER /* 61 */:
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
            case 64:
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
            case ActionId.INTENT_MAPPED /* 73 */:
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
            case ActionId.ACTIVITY_PAUSED /* 75 */:
            case ActionId.ACTIVITY_STARTED /* 76 */:
            case ActionId.ACTIVITY_RESUMED /* 77 */:
            case ActionId.FRAGMENT_CREATED /* 78 */:
            case ActionId.FRAGMENT_RESUMED /* 79 */:
            case 80:
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
            case ActionId.MARKER_SWAPPED /* 84 */:
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
            case ActionId.ERROR /* 87 */:
            case ActionId.METHOD_INVOKE /* 88 */:
            case ActionId.FINALLY /* 89 */:
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
            case ActionId.ANIMATION_END /* 93 */:
            case ActionId.UDP_REQUEST_SEND /* 94 */:
            case ActionId.MAIN_COMPLETE /* 95 */:
            case ActionId.INTERRUPTED /* 96 */:
            case ActionId.NETWORK_FAILED /* 97 */:
            case ActionId.NETWORK_RESPONSE /* 98 */:
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
            case 100:
                break;
            case 63:
                add(4648016178001608704L);
                break;
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                addAll(C08u.A0m);
                addAll(C08u.A0n);
                add(C02D.A0u);
                add(C02D.A1h);
                return;
            default:
                AnonymousClass001.A1J(this, 1);
                l = 22;
                add(l);
        }
        l = 4648017411461611520L;
        add(l);
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (ActionId.ON_VIEW_CREATED_END - this.A00 != 0) {
            return super.contains(obj);
        }
        if (obj instanceof 02C) {
            return super.contains(obj);
        }
        return false;
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (ActionId.ON_VIEW_CREATED_END - this.A00 != 0) {
            return super.remove(obj);
        }
        if (obj instanceof 02C) {
            return super.remove(obj);
        }
        return false;
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return ActionId.ON_VIEW_CREATED_END - this.A00 != 0 ? super.size() : super.size();
    }
}
