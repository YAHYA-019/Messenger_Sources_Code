package X;

/* renamed from: X.0z4, reason: invalid class name */
/* loaded from: 0z4.class */
public abstract class C0z4 {
    public static String A00(int i) {
        if (i == 1) {
            return "PATH_PROVIDER_GET_PATH";
        }
        if (i == 3) {
            return "PATH_PROVIDER_GET_PATH_WITHOUT_INIT";
        }
        if (i == 8355) {
            return "PATH_PROVIDER_REMOTE_WIPE_PERFORM_REMOVAL_ON_PATH";
        }
        if (i == 15035) {
            return "PATH_PROVIDER_REMOTE_WIPE_TRIGGER_CLEANUP_ACTION";
        }
        switch (i) {
            case 5:
                return "PATH_PROVIDER_PLUGIN_ON_PATH_REQUESTED";
            case 6:
                return "PATH_PROVIDER_INIT";
            case 7:
                return "PATH_PROVIDER_REGISTER_PATH";
            case 8:
                return "PATH_PROVIDER_PERFORM_EVICTION";
            case 9:
                return "PATH_PROVIDER_SIZE_PLUGIN_TRIGGER_CLEANUP_ACTION";
            case 10:
                return "PATH_PROVIDER_STALE_PLUGIN_TRIGGER_CLEANUP_ACTION";
            case 11:
                return "PATH_PROVIDER_SIZE_PLUGIN_PERFORM_REMOVAL_ON_PATH";
            case 12:
                return "PATH_PROVIDER_STALE_PLUGIN_PERFORM_REMOVAL_ON_PATH";
            case 13:
                return "PATH_PROVIDER_SCOPE_PLUGIN_PERFORM_REMOVAL_ON_PATH";
            case 14:
                return "PATH_PROVIDER_SCOPE_PLUGIN_TRIGGER_CLEANUP_ACTION";
            case 15:
                return "PATH_PROVIDER_MASTER_SLAVE_SYNC";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
