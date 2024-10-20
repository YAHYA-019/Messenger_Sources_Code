package com.facebook.xapp.messaging.threadpre.events.events.common;

import X.1Q5;
import X.6Bw;
import X.7zK;
import com.facebook.messaging.analytics.perf.events.events.AIBotSuggestedPromptsQueryEnd;
import com.facebook.messaging.analytics.perf.events.events.CutoverMigrationState;
import com.facebook.messaging.analytics.perf.events.events.IsCutOverThread;
import com.facebook.messaging.analytics.perf.events.events.MessageListRecyclerViewLayoutEnd;
import com.facebook.messaging.analytics.perf.events.events.MessageListRecyclerViewLayoutStart;
import com.facebook.messaging.analytics.perf.events.events.MessageListRecyclerViewMeasureEnd;
import com.facebook.messaging.analytics.perf.events.events.MessageListRecyclerViewMeasureStart;
import com.facebook.messaging.analytics.perf.events.events.MessageRowGenerationEnd;
import com.facebook.messaging.analytics.perf.events.events.MessageRowGenerationStart;
import com.facebook.messaging.analytics.perf.events.events.MessagesRenderComplete;
import com.facebook.messaging.analytics.perf.events.events.MsysThreadViewQuerySubscriberPreloadEnd;
import com.facebook.messaging.analytics.perf.events.events.ShowThread;
import com.facebook.messaging.analytics.perf.events.events.ThreadItemOnClickEnd;
import com.facebook.messaging.analytics.perf.events.events.ThreadItemOnClickStart;
import com.facebook.messaging.analytics.perf.events.events.ThreadViewOnSetupEnd;
import com.facebook.messaging.analytics.perf.events.events.ThreadViewOnSetupStart;
import com.facebook.messaging.analytics.perf.events.events.ThreadViewParallelFetchEnd;
import com.facebook.messaging.analytics.perf.events.events.ThreadViewParallelFetchStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.composer.ComposerCreateViewEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.composer.ComposerCreateViewStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.composer.ComposerOnCreateLayoutEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.composer.ComposerOnCreateLayoutStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.mailboxthreadsource.MailboxRequestDataEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.mailboxthreadsource.MailboxRequestDataStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.mailboxthreadsource.RequestFetch;
import com.facebook.xapp.messaging.threadpre.events.events.common.mailboxthreadsource.ThreadSourceDataProcessingEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.mailboxthreadsource.ThreadSourceDataProcessingStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessageListAdaptEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessageListAdaptStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessageListCombineEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessageListCombineStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessageListDataFetchEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessageListDataFetchStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessageListOnDataBoundRendered;
import com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessageListOnDataRenderStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessageListOnDataRendered;
import com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessageListOnFrameDrawn;
import com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessagesContainerCreateViewEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessagesContainerCreateViewStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessagesContainerLayoutCreateEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessagesContainerLayoutCreateStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.primarydataload.PrimaryDataLoadOnDataLoadedEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.primarydataload.PrimaryDataLoadOnDataLoadedStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.primarydataload.PrimaryDataLoadSubscribeEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.primarydataload.PrimaryDataLoadSubscribeStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.primarydataload.PrimaryDataLoadTranslationEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.primarydataload.PrimaryDataLoadTranslationStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.qplevent.UiIdle;
import com.facebook.xapp.messaging.threadpre.events.events.common.secondarydataload.SecondaryDataLoadOnDataLoadedEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.secondarydataload.SecondaryDataLoadOnDataLoadedStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.secondarydataload.SecondaryDataLoadSubscribeEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.secondarydataload.SecondaryDataLoadSubscribeStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.threadview.ThreadViewOnPagination;
import com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecycle.ThreadViewOnCreateViewEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecycle.ThreadViewOnCreateViewStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecycle.ThreadViewOnFragmentCreateEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecycle.ThreadViewOnFragmentCreateStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecycle.ThreadViewOnPause;
import com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecycle.ThreadViewOnReopen;
import com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecycle.ThreadViewOnResumeEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecycle.ThreadViewOnResumeStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecycle.ThreadViewOnThreadClosed;
import com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecyclelistener.ThreadViewLifecycleListenerOnCreateViewEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecyclelistener.ThreadViewLifecycleListenerOnCreateViewStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecyclelistener.ThreadViewLifecycleListenerOnFragmentVisibleEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecyclelistener.ThreadViewLifecycleListenerOnFragmentVisibleStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.titlebar.TitleBarCreateViewEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.titlebar.TitleBarCreateViewStart;
import com.facebook.xapp.messaging.threadpre.events.events.common.titlebar.TitleBarOnCreateLayoutEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.titlebar.TitleBarOnCreateLayoutStart;

/* loaded from: PRELoggingEvent.class */
public abstract class PRELoggingEvent implements 1Q5 {
    public long A00 = -1;
    public 6Bw A01;
    public final int A02;

    public PRELoggingEvent(int i) {
        this.A02 = i;
    }

    public String A00() {
        if (this instanceof MessagesRenderComplete) {
            return "messages_render_complete";
        }
        if (this instanceof MessageListOnFrameDrawn) {
            return "message_list_frame_drawn";
        }
        if (this instanceof ThreadViewOnResumeEnd) {
            return "threadview_on_resume";
        }
        if (this instanceof ThreadItemOnClickEnd) {
            return "thread_item_on_click";
        }
        if (this instanceof MessageListAdaptStart) {
            return "message_list_adapt";
        }
        if (this instanceof ThreadViewOnReopen) {
            return "threadview_on_reopen";
        }
        if (this instanceof MessageListAdaptEnd) {
            return "message_list_adapt";
        }
        if (this instanceof MessageListCombineStart) {
            return "message_list_combine";
        }
        if (this instanceof MessagesContainerLayoutCreateStart) {
            return "messages_container_layout_create";
        }
        if (this instanceof MessageListCombineEnd) {
            return "message_list_combine";
        }
        if (this instanceof MessageRowGenerationStart) {
            return "message_row_generation";
        }
        if (this instanceof ComposerOnCreateLayoutEnd) {
            return "composer_on_create_layout";
        }
        if (this instanceof MessageRowGenerationEnd) {
            return "message_row_generation";
        }
        if (this instanceof ComposerOnCreateLayoutStart) {
            return "composer_on_create_layout";
        }
        if (this instanceof MessagesContainerLayoutCreateEnd) {
            return "messages_container_layout_create";
        }
        if (this instanceof RequestFetch) {
            return "data/request_fetch";
        }
        if ((this instanceof MessageListRecyclerViewMeasureStart) || (this instanceof MessageListRecyclerViewMeasureEnd)) {
            return "message_list_recycler_view_measure";
        }
        if ((this instanceof TitleBarOnCreateLayoutStart) || (this instanceof TitleBarOnCreateLayoutEnd)) {
            return "title_bar_on_create_layout";
        }
        if ((this instanceof ThreadViewOnSetupStart) || (this instanceof ThreadViewOnSetupEnd)) {
            return "threadview_on_setup";
        }
        if ((this instanceof SecondaryDataLoadSubscribeStart) || (this instanceof SecondaryDataLoadSubscribeEnd)) {
            return "secondary_data_load_subscribe";
        }
        if ((this instanceof PrimaryDataLoadSubscribeStart) || (this instanceof PrimaryDataLoadSubscribeEnd)) {
            return "primary_data_load_subscribe";
        }
        if (this instanceof ThreadSourceDataProcessingEnd) {
            return "thread_source_data_processing";
        }
        if (this instanceof MessageListRecyclerViewLayoutEnd) {
            return "message_list_recycler_view_layout";
        }
        if (this instanceof MailboxRequestDataEnd) {
            return "mailbox_data_request";
        }
        if (this instanceof ThreadSourceDataProcessingStart) {
            return "thread_source_data_processing";
        }
        if (this instanceof PrimaryDataLoadTranslationStart) {
            return "primary_data_load_translation";
        }
        if (this instanceof PrimaryDataLoadOnDataLoadedEnd) {
            return "primary_data_load_on_data_loaded";
        }
        if (this instanceof PrimaryDataLoadTranslationEnd) {
            return "primary_data_load_translation";
        }
        if (this instanceof MessageListRecyclerViewLayoutStart) {
            return "message_list_recycler_view_layout";
        }
        if (this instanceof PrimaryDataLoadOnDataLoadedStart) {
            return "primary_data_load_on_data_loaded";
        }
        if ((this instanceof ThreadViewLifecycleListenerOnFragmentVisibleStart) || (this instanceof ThreadViewLifecycleListenerOnFragmentVisibleEnd)) {
            return "threadview_lifecycle_listener_on_fragment_visible";
        }
        if (this instanceof ThreadViewOnResumeStart) {
            return "threadview_on_resume";
        }
        if (this instanceof ShowThread) {
            return "show_thread";
        }
        if ((this instanceof ThreadViewLifecycleListenerOnCreateViewStart) || (this instanceof ThreadViewLifecycleListenerOnCreateViewEnd)) {
            return "threadview_lifecycle_listener_on_create_view";
        }
        if (this instanceof ThreadViewOnCreateViewEnd) {
            return "threadview_on_create_view";
        }
        if (this instanceof ComposerCreateViewEnd) {
            return "composer_create_view";
        }
        if (this instanceof MessagesContainerCreateViewEnd) {
            return "messages_container_create_view";
        }
        if (!(this instanceof MessageListDataFetchEnd)) {
            if (this instanceof ComposerCreateViewStart) {
                return "composer_create_view";
            }
            if ((this instanceof TitleBarCreateViewStart) || (this instanceof TitleBarCreateViewEnd)) {
                return "title_bar_create_view";
            }
            if (this instanceof MessagesContainerCreateViewStart) {
                return "messages_container_create_view";
            }
            if (!(this instanceof MessageListDataFetchStart)) {
                return ((this instanceof ThreadViewOnFragmentCreateStart) || (this instanceof ThreadViewOnFragmentCreateEnd)) ? "threadview_on_fragment_create" : !(this instanceof ThreadViewOnCreateViewStart) ? ((this instanceof SecondaryDataLoadOnDataLoadedStart) || (this instanceof SecondaryDataLoadOnDataLoadedEnd)) ? "secondary_data_load_on_data_loaded" : ((this instanceof ThreadViewParallelFetchEnd) || (this instanceof ThreadViewParallelFetchStart)) ? "threadview_parallel_fetch" : !(this instanceof MailboxRequestDataStart) ? this instanceof ThreadViewOnThreadClosed ? "threadview_on_thread_closed" : this instanceof ThreadViewOnPause ? "threadview_on_pause" : this instanceof ThreadViewOnPagination ? "threadview_on_pagination" : this instanceof UiIdle ? "ui_idle" : ((this instanceof MessageListOnDataRendered) || (this instanceof MessageListOnDataRenderStart)) ? "message_list_on_data_render" : this instanceof MessageListOnDataBoundRendered ? "message_list_on_data_bound_rendered" : ((this instanceof IsCutOverThread) || (this instanceof CutoverMigrationState)) ? "" : !(this instanceof ThreadItemOnClickStart) ? this instanceof MsysThreadViewQuerySubscriberPreloadEnd ? "msys_thread_view_query_subscriber_preload" : "suggested_prompts/query" : "thread_item_on_click" : "mailbox_data_request" : "threadview_on_create_view";
            }
        }
        return 7zK.A00(358);
    }

    public String A01() {
        if (this instanceof PRELoggingStartEvent) {
            return "_start";
        }
        if (this instanceof PRELoggingEndEvent) {
            PRELoggingEndEvent pRELoggingEndEvent = (PRELoggingEndEvent) this;
            return pRELoggingEndEvent instanceof RequestFetch ? ((RequestFetch) pRELoggingEndEvent).A00 : pRELoggingEndEvent instanceof AIBotSuggestedPromptsQueryEnd ? "/end" : "_end";
        }
        if ((this instanceof MessageListOnFrameDrawn) || (this instanceof ShowThread) || (this instanceof ThreadViewOnThreadClosed) || (this instanceof ThreadViewOnPause) || (this instanceof ThreadViewOnPagination) || (this instanceof UiIdle) || (this instanceof MessageListOnDataRendered)) {
            return "";
        }
        boolean z = this instanceof MessageListOnDataRenderStart;
        return "";
    }
}
