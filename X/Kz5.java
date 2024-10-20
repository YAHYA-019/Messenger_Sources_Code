package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Kz5.class */
public abstract class Kz5 {
    public static final C3088Jiq A05 = new LRg("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
    public static final C3088Jiq A01 = new LRg("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
    public static final C3091Jit A0d = new LRg("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
    public static final C3089Jir A0C = new LRg("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
    public static final C3092Jiu A0n = new LRg("START_SAFE_BROWSING", "START_SAFE_BROWSING");
    public static final C3092Jiu A0e = new LRg("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
    public static final C3092Jiu A0f = new LRg("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
    public static final C3092Jiu A0g = new LRg("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
    public static final C3092Jiu A0h = new LRg("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
    public static final C3092Jiu A0j = new LRg("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
    public static final C3089Jir A0D = new LRg("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
    public static final C3089Jir A0F = new LRg("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
    public static final C3089Jir A0G = new LRg("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
    public static final C3089Jir A0H = new LRg("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
    public static final C3089Jir A0E = new LRg("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
    public static final C3089Jir A0I = new LRg("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
    public static final C3088Jiq A04 = new LRg("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
    public static final C3088Jiq A03 = new LRg("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
    public static final C3089Jir A0J = new LRg("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
    public static final C3092Jiu A0i = new LRg("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
    public static final C3089Jir A0K = new LRg("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
    public static final C3088Jiq A0B = new LRg("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
    public static final C3088Jiq A0A = new LRg("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
    public static final C3092Jiu A0k = new LRg("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
    public static final C3092Jiu A0l = new LRg("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
    public static final C3092Jiu A0m = new LRg("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
    public static final C3088Jiq A08 = new LRg("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
    public static final C3088Jiq A07 = new LRg("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
    public static final C3090Jis A0Z = new LRg("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
    public static final C3088Jiq A09 = new LRg("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
    public static final C3088Jiq A00 = new LRg("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
    public static final C3088Jiq A02 = new LRg("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
    public static final C3088Jiq A06 = new LRg("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
    public static final C3091Jit A0c = new LRg("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
    public static final C3091Jit A0b = new LRg("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
    public static final C3094Jiw A0q = new LRg("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
    public static final C3094Jiw A0s = new LRg("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
    public static final C3093Jiv A0o = new LRg("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
    public static final C3097Jiz A0u = new KxD();
    public static final C3096Jiy A0t = new KxD();
    public static final C3094Jiw A0r = new LRg("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
    public static final C3095Jix A0v = new C3095Jix();
    public static final C3090Jis A0U = new LRg("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
    public static final C3090Jis A0R = new LRg("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
    public static final C3094Jiw A0p = new LRg("FORCE_DARK", "FORCE_DARK");
    public static final C3090Jis A0O = new LRg("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
    public static final C3090Jis A0a = new LRg("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
    public static final C3090Jis A0M = new LRg("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
    public static final C3090Jis A0V = new LRg("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
    public static final C3090Jis A0Q = new LRg("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
    public static final C3090Jis A0N = new LRg("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
    public static final C3090Jis A0P = new LRg("GET_COOKIE_INFO", "GET_COOKIE_INFO");
    public static final C3090Jis A0W = new LRg("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
    public static final C3090Jis A0X = new LRg("USER_AGENT_METADATA", "USER_AGENT_METADATA");
    public static final C3090Jis A0S = new C3087Jip();
    public static final C3090Jis A0L = new LRg("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
    public static final C3090Jis A0Y = new LRg("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
    public static final C3090Jis A0T = new LRg("MUTE_AUDIO", "MUTE_AUDIO");

    public static boolean A00(String str) {
        Set<LRg> unmodifiableSet = Collections.unmodifiableSet(LRg.A02);
        HashSet A0v2 = AnonymousClass001.A0v();
        for (LRg lRg : unmodifiableSet) {
            if (lRg.A00.equals(str)) {
                A0v2.add(lRg);
            }
        }
        if (A0v2.isEmpty()) {
            throw AnonymousClass001.A0T(0Pz.A0W("Unknown feature ", str));
        }
        Iterator it = A0v2.iterator();
        while (it.hasNext()) {
            LRg lRg2 = (MBz) it.next();
            if (lRg2.A00() || lRg2.A01()) {
                return true;
            }
        }
        return false;
    }
}
