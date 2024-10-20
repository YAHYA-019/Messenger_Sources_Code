package X;

import com.facebook.acra.constants.ActionId;

/* renamed from: X.0ok, reason: invalid class name */
/* loaded from: 0ok.class */
public abstract class C0ok {
    public static String A00(int i) {
        if (i == 1) {
            return "CAMERA_PERSON_SEGMENTATION_SINGLE_FRAME";
        }
        if (i == 2) {
            return "CAMERA_FACE_TRACKER_SINGLE_FRAME";
        }
        if (i == 3) {
            return "CAMERA_WORLD_TRACKER_SINGLE_FRAME";
        }
        if (i == 4) {
            return "CAMERA_WORLD_TRACKER_ADD_ANCHOR";
        }
        if (i == 6) {
            return "CAMERA_FACE_TRACKER_NORMALIZE_IMAGE";
        }
        if (i == 7) {
            return "CAMERA_FACE_TRACKER_TRACK_TARGETS";
        }
        if (i == 13) {
            return "CAMERA_AR_SERVICE_CREATE";
        }
        if (i == 14) {
            return "CAMERA_AR_SERVICEHOST_PREPARE";
        }
        if (i == 30) {
            return "CAMERA_ARENGINE_EFFECT_CREATE";
        }
        if (i == 31) {
            return "CAMERA_ARENGINE_EFFECT_LOAD";
        }
        if (i == 40) {
            return "CAMERA_AR_SERVICE_SNAPSHOT_ALL";
        }
        if (i == 41) {
            return "CAMERA_ARENGINE_WAIT_FACETRACKER_RESULT";
        }
        if (i == 45) {
            return "CAMERA_ARENGINE_GPU_TIME";
        }
        if (i == 46) {
            return "CAMERA_CAMERA_SINGLE_EFFECT_RUN";
        }
        switch (i) {
            case 8:
                return "CAMERA_FACE_TRACKER_3D_INFERENCE";
            case 9:
                return "CAMERA_FACE_TRACKER_ACQUIRE_TARGETS";
            case 10:
                return "CAMERA_FACE_TRACKER_LOAD_MODELS";
            case 11:
                return "CAMERA_AR_SERVICE_LOAD";
            case ActionId.QUEUEING_FAIL /* 56 */:
                return "CAMERA_AR_RENDER_TIME";
            case ActionId.PHOTO_CAPTURED /* 59 */:
                return "CAMERA_ARENGINE_WAIT_FOR_DATA";
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                return "CAMERA_FACE_TRACKER_TRACK_IRIS";
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                return "CAMERA_FACE_TRACKER_IRIS_3D_INFERENCE";
            case ActionId.INTENT_MAPPED /* 73 */:
                return "CAMERA_ARENGINE_TEXTURE_STORAGE_LOAD";
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                return "CAMERA_HAND_TRACKING_FRAME";
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                return "CAMERA_FACE_TRACKER_EXPRESSION_TRACKING_CALCULATE_WEIGHTS";
            case ActionId.ACTIVITY_STARTED /* 76 */:
                return "CAMERA_FACE_TRACKER_FACIAL_GESTURE_CLASSIFIER";
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                return "CAMERA_IMAGETRACKERADDPATTERN";
            case 80:
                return "CAMERA_IMAGETRACKERDETERMINEPOSES";
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                return "CAMERA_RECOGNITIONTRACKINGSTEP";
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                return "CAMERA_RECOGNITIONTRACKINGONRECOGNIZED";
            case ActionId.MARKER_SWAPPED /* 84 */:
                return "CAMERA_STANDALONE_TRACKING_UPDATE_AND_TRACK_FRAME";
            case ActionId.ERROR /* 87 */:
                return "CAMERA_IMAGETRACKERSYNCPROCESSFRAME";
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                return "CAMERA_FACE_ACTIONS_REFINE_BLENDSHAPES";
            case ActionId.MAIN_COMPLETE /* 95 */:
                return "CAMERA_FACE_ACTIONS_LOAD_MODEL";
            case ActionId.INTERRUPTED /* 96 */:
                return "CAMERA_HAIR_SEGMENTATION_SINGLE_FRAME";
            case ActionId.NETWORK_RESPONSE /* 98 */:
                return "CAMERA_HAIR_SEGMENTATION_NORMALIZE";
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                return "CAMERA_HAIR_SEGMENTATION_CAFFE2";
            case 100:
                return "CAMERA_HAIR_SEGMENTATION_NORMALIZEOUTPUT";
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                return "CAMERA_HAIR_SEGMENTATION_LOAD_MODEL";
            case ActionId.DATA_LOAD_START /* 102 */:
                return "CAMERA_PERSON_SEGMENTATION_LOAD_MODEL";
            case ActionId.LEGACY_MARKER /* 103 */:
                return "CAMERA_HAND_TRACKING_INIT";
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                return "CAMERA_HAND_TRACKING_LOAD_MODEL";
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                return "CAMERA_POPCORN_BENCHMARK_RUN";
            case ActionId.TIMEOUT /* 113 */:
                return "CAMERA_POPCORN_BENCHMARK_RUN_BEFORE_TEARDOWN";
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
                return "CAMERA_TARGET_TRACKER_SINGLE_FRAME";
            case ActionId.VIDEO_PLAYING /* 116 */:
                return "CAMERA_MULTICLASS_SEGMENTATION_NORMALIZEOUTPUT";
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                return "CAMERA_BODY_TRACKING_SINGLE_FRAME";
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                return "CAMERA_BODY_TRACKING_LOAD_MODEL";
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                return "CAMERA_BODY_TRACKING_NORMALIZE_INPUT";
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                return "CAMERA_BODY_TRACKING_NORMALIZE_BGRA_INPUT";
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                return "CAMERA_BODY_TRACKING_CAFFE2";
            case 1032:
                return "CAMERA_LANDMARK_AR_SINGLE_FRAME";
            case 1069:
                return "CAMERA_FC_AR_RENDERING_HEARTBEAT";
            case 1089:
                return "CAMERA_SV_SEGMENTATION_CLOTHING_PER_FRAME_TIME";
            case 1226:
                return "CAMERA_WORLD_TRACKER_TRACK_POINT";
            case 1466:
                return "CAMERA_SV_GENERIC_PER_FRAME_TIME";
            case 2018:
                return "CAMERA_EFFECT_SESSION_START";
            case 2077:
                return "CAMERA_OPEN_ML_PBP_PROCESS_IMAGE_BUFFER";
            case 2296:
                return "CAMERA_ARENGINE_AVATAR_SKELETON_INIT";
            case 2505:
                return "CAMERA_FACE_ACTIONS_PROCESS_IMAGE_BUFFER";
            case 2735:
                return "CAMERA_ARENGINE_AVATAR_RENDER_INIT";
            case 3100:
                return "CAMERA_AR_SESSION";
            case 3245:
                return "CAMERA_PERFORMANCE_TEST_MODELRUN";
            case 3598:
                return "CAMERA_WOLF_SLAM_INIT_TIME";
            case 3772:
                return "CAMERA_OPEN_ML_CONVERT_INPUT_FORMAT";
            case 3852:
                return "CAMERA_JSVM_SCRIPT_EXECUTE";
            case 3941:
                return "CAMERA_FACE_ACTIONS_PLUGINS_RESET_CALIBRATION";
            case 4162:
                return "CAMERA_FC_AR_RENDERING";
            case 4344:
                return "CAMERA_PERFORMANCE_TEST_LOAD_MODEL";
            case 4406:
                return "CAMERA_ARENGINE_SCRIPT_DOCUMENT_CREATE";
            case 4759:
                return "CAMERA_SV_SEGMENTATION_FACE_PARSING_INFERENCE_TIME";
            case 5090:
                return "CAMERA_SV_SEGMENTATION_FACE_PARSING_PER_FRAME_TIME";
            case 5145:
                return "CAMERA_SV_BODY_TRACKING_MODEL_LOAD";
            case 5163:
                return "CAMERA_SV_BODY_TRACKING_INFERENCE_TIME";
            case 5372:
                return "CAMERA_FACE_ACTIONS_INFERENCE";
            case 5411:
                return "CAMERA_ARENGINE_RENDERER_SUBMIT_SHAPE";
            case 5416:
                return "CAMERA_AR_SYS_RESOURCE";
            case 5880:
                return "CAMERA_SV_SEGMENTATION_CLOTHING_INFERENCE_TIME";
            case 5886:
                return "CAMERA_GAN_MODEL_INFERENCE";
            case 6148:
                return "CAMERA_FACE_ACTIONS_CONVERT_IMAGE_FORMAT";
            case 7280:
                return "CAMERA_SV_HAND_TRACKING_INFERENCE_TIME";
            case 7660:
                return "CAMERA_WORLD_TRACKER_INPUTSYNC_PROCESSINPUT";
            case 7667:
                return "CAMERA_SV_SEGMENTATION_CLOTHING_MODEL_LOAD";
            case 7765:
                return "CAMERA_IG_CAMERA_WRITE_DEVICE_CAPABILITIES";
            case 7824:
                return "CAMERA_AR_SUBEFFECT_FIRST_SYNC";
            case 8005:
                return "CAMERA_WORLD_TRACKER_CALCULATOR_FIRSTFRAME_RENDER";
            case 8065:
                return "CAMERA_MULTICLASS_SEGMENTATION_NORMALIZE";
            case 8184:
                return "CAMERA_FACEWAVE_SINGLE_FRAME";
            case 8285:
                return "CAMERA_SV_SEGMENTATION_FACE_PARSING_MODEL_LOAD";
            case 8345:
                return "CAMERA_SV_GENERIC_INFERENCE";
            case 8413:
                return "CAMERA_AR_SUBEFFECT_SERVICES_LOAD";
            case 8432:
                return "CAMERA_AR_SUBEFFECT_DOWNLOAD";
            case 8707:
                return "CAMERA_MLTEXTURE_MODEL_INFERENCE";
            case 8858:
                return "CAMERA_SV_HAND_TRACKING_MODEL_LOAD";
            case 9035:
                return "CAMERA_FACE_ACTIONS_PLUGIN_WAIT_FOR_DATA";
            case 9074:
                return "CAMERA_ARENGINE_AVATAR_RENDER_UPDATE";
            case 9395:
                return "CAMERA_WORLD_TRACKER_DETECTPLANE_SINGLE_FRAME";
            case 9614:
                return "CAMERA_SV_GAN_CROP_BB_IMAGE";
            case 9621:
                return "CAMERA_AR_SUBEFFECT_DESTROY";
            case 9810:
                return "CAMERA_MULTICLASS_SEGMENTATION_MODELRUN";
            case 9854:
                return "CAMERA_C2E_SINGLE_FRAME";
            case 9916:
                return "CAMERA_SV_HAND_TRACKING_PER_FRAME_TIME";
            case 10373:
                return "CAMERA_MULTICLASS_SEGMENTATION_LOAD_MODEL";
            case 10717:
                return "CAMERA_C2E_LOAD_MODEL";
            case 10860:
                return "CAMERA_SV_GENERIC_MODEL_LOAD";
            case 10980:
                return "CAMERA_OPEN_ML_ASSIGN_PROCESS_IMAGE_RESULT";
            case 11100:
                return "CAMERA_ARENGINE_AVATAR_UPDATE";
            case 11194:
                return "CAMERA_SV_DETECTOR_CONTROLLER_PROCESS_INPUT_FRAME";
            case 11459:
                return "CAMERA_CAMERA_TIME_TO_RENDER_FILTER";
            case 11481:
                return "CAMERA_PERFORMANCE_TEST_SINGLE_FRAME";
            case 11878:
                return "CAMERA_SV_TEXTURE_GENERATOR_PER_FRAME_TIME";
            case 12658:
                return "CAMERA_MULTICLASS_SEGMENTATION_SINGLE_FRAME";
            case 12887:
                return "CAMERA_SV_BODY_TRACKING_PER_FRAME_TIME";
            case 12981:
                return "CAMERA_OPEN_ML_TEXTURE_STITCH_MODEL_OUTPUT";
            case 13002:
                return "CAMERA_WORLD_TRACKER_ANCHOR_SINGLE_FRAME";
            case 13317:
                return "CAMERA_WOLF_FIRSTFRAME_RENDER";
            case 13896:
                return "CAMERA_JSVM_INITIALIZE";
            case 14296:
                return "CAMERA_OPEN_ML_RUN_ALL_SV_DETECTORS";
            case 14425:
                return "CAMERA_FIRST_FRAME_RENDER_TIME";
            case 14592:
                return "CAMERA_ARENGINE_AVATAR_LOAD";
            case 14616:
                return "CAMERA_AR_SUBEFFECT_METADATA_DOWNLOAD";
            case 14704:
                return "CAMERA_AR_SUBEFFECT_CREATE_FROM_EXTERNAL_FBID";
            case 14809:
                return "CAMERA_PERFORMANCE_TEST_NORMALIZE";
            case 14877:
                return "CAMERA_FACEWAVE_LOAD_MODEL";
            case 15080:
                return "CAMERA_AR_SUBEFFECT_LOAD";
            case 15383:
                return "CAMERA_UNIFIED_TARGET_TRACKER_SINGLE_FRAME";
            case 15833:
                return "CAMERA_OPEN_ML_GENERATE_ALL_MLTEXTURES";
            case 15872:
                return "CAMERA_OPEN_ML_LOAD_PYTORCH_MODEL";
            case 16066:
                return "CAMERA_WORLD_TRACKER_ALGO_SINGLE_FRAME";
            case 16193:
                return "CAMERA_ARENGINE_MATERIAL_CREATE_SHADER_MODULES";
            case 16238:
                return "CAMERA_OPEN_ML_TEXTURE_MODEL_PROCESSOR_CREATE_FINAL_OUTPUT_BUFFER";
            case 16245:
                return "CAMERA_C2E_PREDICTION";
            case 16246:
                return "CAMERA_WORLD_TRACKER_CALCULATOR_STEP";
            case 21772:
                return "CAMERA_AR_SERVICE_POST_LOAD";
            default:
                switch (i) {
                    case 26:
                        return "CAMERA_ARENGINE_SCRIPT_EXECUTOR_CREATE";
                    case 27:
                        return "CAMERA_ARENGINE_VIEWPORT_PRERENDER";
                    case 28:
                        return "CAMERA_ARENGINE_VIEWPORT_RENDER";
                    default:
                        switch (i) {
                            case 33:
                                return "CAMERA_AR_SERVICE_VIDEO_BUFFER_CONVERT";
                            case 34:
                                return "CAMERA_ARENGINE_MANIFEST_DESERIALIZE";
                            case 35:
                                return "CAMERA_WORLD_TRACKER_SLAM";
                            case 36:
                                return "CAMERA_ARENGINE_VIEWPORT_CREATE";
                            case 37:
                                return "CAMERA_ARENGINE_RENDER_SESSION_CREATE";
                            case 38:
                                return "CAMERA_VISUAL_SLAM_SINGLE_FRAME";
                            default:
                                switch (i) {
                                    case ActionId.IN_PROGRESS /* 49 */:
                                        return "CAMERA_PERSON_SEGMENTATION_INIT";
                                    case 50:
                                        return "CAMERA_PERSON_SEGMENTATION_NORMALIZE";
                                    case ActionId.UNKNOWN /* 51 */:
                                        return "CAMERA_PERSON_SEGMENTATION_CAFFE2";
                                    case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                                        return "CAMERA_PERSON_SEGMENTATION_NORMALIZEOUTPUT";
                                    default:
                                        switch (i) {
                                            case 64:
                                                return "CAMERA_ARENGINE_EFFECT_MIGRATE";
                                            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                                                return "CAMERA_ARENGINE_EFFECT_DOCUMENT_LOAD";
                                            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                                                return "CAMERA_ARENGINE_TEXTURE_LOAD";
                                            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                                                return "CAMERA_ARENGINE_EFFECT_UPDATE_AUDIO";
                                            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                                                return "CAMERA_ARENGINE_EFFECT_UPDATE_SCENE";
                                            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                                                return "CAMERA_ARENGINE_EFFECT_UPDATE_SCRIPT";
                                            default:
                                                return "UNDEFINED_QPL_EVENT";
                                        }
                                }
                        }
                }
        }
    }
}
