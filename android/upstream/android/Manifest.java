/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package android;

public final class Manifest {
    public static final class permission {
        /**  Allow an application to read and write the cache partition.
         @hide 
         */
        public static final String ACCESS_CACHE_FILESYSTEM="android.permission.ACCESS_CACHE_FILESYSTEM";
        /**  Allows read/write access to the "properties" table in the checkin
         database, to change values that get uploaded. 
         */
        public static final String ACCESS_CHECKIN_PROPERTIES="android.permission.ACCESS_CHECKIN_PROPERTIES";
        /**  Allows an application to access coarse (e.g., Cell-ID, WiFi) location 
         */
        public static final String ACCESS_COARSE_LOCATION="android.permission.ACCESS_COARSE_LOCATION";
        /**  Allows an application to access fine (e.g., GPS) location 
         */
        public static final String ACCESS_FINE_LOCATION="android.permission.ACCESS_FINE_LOCATION";
        /**  Allows an application to access extra location provider commands 
         */
        public static final String ACCESS_LOCATION_EXTRA_COMMANDS="android.permission.ACCESS_LOCATION_EXTRA_COMMANDS";
        /**  Allows an application to create mock location providers for testing 
         */
        public static final String ACCESS_MOCK_LOCATION="android.permission.ACCESS_MOCK_LOCATION";
        /**  Allows an application to access the MTP USB kernel driver.
         For use only by the device side MTP implementation.
         @hide 
         */
        public static final String ACCESS_MTP="android.permission.ACCESS_MTP";
        /**  Allows applications to access information about networks 
         */
        public static final String ACCESS_NETWORK_STATE="android.permission.ACCESS_NETWORK_STATE";
        /**  Allows an application to use SurfaceFlinger's low level features 
         */
        public static final String ACCESS_SURFACE_FLINGER="android.permission.ACCESS_SURFACE_FLINGER";
        /**  Allows applications to access information about Wi-Fi networks 
         */
        public static final String ACCESS_WIFI_STATE="android.permission.ACCESS_WIFI_STATE";
        /**  Allows applications to call into AccountAuthenticators. Only
    the system can get this permission. 
         */
        public static final String ACCOUNT_MANAGER="android.permission.ACCOUNT_MANAGER";
        /**  Allows an application to add voicemails into the system. 
         */
        public static final String ADD_VOICEMAIL="com.android.voicemail.permission.ADD_VOICEMAIL";
        /**  Allows access to ASEC non-destructive API calls
         @hide  
         */
        public static final String ASEC_ACCESS="android.permission.ASEC_ACCESS";
        /**  Allows creation of ASEC volumes
         @hide  
         */
        public static final String ASEC_CREATE="android.permission.ASEC_CREATE";
        /**  Allows destruction of ASEC volumes
         @hide  
         */
        public static final String ASEC_DESTROY="android.permission.ASEC_DESTROY";
        /**  Allows mount / unmount of ASEC volumes
         @hide  
         */
        public static final String ASEC_MOUNT_UNMOUNT="android.permission.ASEC_MOUNT_UNMOUNT";
        /**  Allows rename of ASEC volumes
         @hide  
         */
        public static final String ASEC_RENAME="android.permission.ASEC_RENAME";
        /**  Allows an application to act as an AccountAuthenticator for
         the AccountManager 
         */
        public static final String AUTHENTICATE_ACCOUNTS="android.permission.AUTHENTICATE_ACCOUNTS";
        /**  Allows an application to control the backup and restore process
         @hide pending API council 
         */
        public static final String BACKUP="android.permission.BACKUP";
        /**  Allows an application to collect battery statistics 
         */
        public static final String BATTERY_STATS="android.permission.BATTERY_STATS";
        /**  Allows an application to tell the AppWidget service which application
         can access AppWidget's data.  The normal user flow is that a user
         picks an AppWidget to go into a particular host, thereby giving that
         host application access to the private data from the AppWidget app.
         An application that has this permission should honor that contract.
         Very few applications should need to use this permission. 
         */
        public static final String BIND_APPWIDGET="android.permission.BIND_APPWIDGET";
        /**  Must be required by device administration receiver, to ensure that only the
         system can interact with it. 
         */
        public static final String BIND_DEVICE_ADMIN="android.permission.BIND_DEVICE_ADMIN";
        /**  Must be required by an {@link android.inputmethodservice.InputMethodService},
         to ensure that only the system can bind to it. 
         */
        public static final String BIND_INPUT_METHOD="android.permission.BIND_INPUT_METHOD";
        /**  Must be required by package verifier receiver, to ensure that only the
         system can interact with it.
         @hide
    
         */
        public static final String BIND_PACKAGE_VERIFIER="android.permission.BIND_PACKAGE_VERIFIER";
        /**  Must be required by a {@link android.widget.RemoteViewsService},
         to ensure that only the system can bind to it. 
         */
        public static final String BIND_REMOTEVIEWS="android.permission.BIND_REMOTEVIEWS";
        /**  Must be required by a TextService (e.g. SpellCheckerService)
         to ensure that only the system can bind to it. 
         */
        public static final String BIND_TEXT_SERVICE="android.permission.BIND_TEXT_SERVICE";
        /**  Must be required by an {@link android.net.VpnService},
         to ensure that only the system can bind to it. 
         */
        public static final String BIND_VPN_SERVICE="android.permission.BIND_VPN_SERVICE";
        /**  Must be required by a {@link android.service.wallpaper.WallpaperService},
         to ensure that only the system can bind to it. 
         */
        public static final String BIND_WALLPAPER="android.permission.BIND_WALLPAPER";
        /**  Allows applications to connect to paired bluetooth devices 
         */
        public static final String BLUETOOTH="android.permission.BLUETOOTH";
        /**  Allows applications to discover and pair bluetooth devices 
         */
        public static final String BLUETOOTH_ADMIN="android.permission.BLUETOOTH_ADMIN";
        /**  Required to be able to disable the device (very dangerous!). 
         */
        public static final String BRICK="android.permission.BRICK";
        /**  Allows an application to broadcast a notification that an application
         package has been removed. 
         */
        public static final String BROADCAST_PACKAGE_REMOVED="android.permission.BROADCAST_PACKAGE_REMOVED";
        /**  Allows an application to broadcast an SMS receipt notification 
         */
        public static final String BROADCAST_SMS="android.permission.BROADCAST_SMS";
        /**  Allows an application to broadcast sticky intents.  These are
         broadcasts whose data is held by the system after being finished,
         so that clients can quickly retrieve that data without having
         to wait for the next broadcast. 
         */
        public static final String BROADCAST_STICKY="android.permission.BROADCAST_STICKY";
        /**  Allows an application to broadcast a WAP PUSH receipt notification 
         */
        public static final String BROADCAST_WAP_PUSH="android.permission.BROADCAST_WAP_PUSH";
        /**  C2DM permission.
         @hide Used internally.
     
         */
        public static final String C2D_MESSAGE="android.intent.category.MASTER_CLEAR.permission.C2D_MESSAGE";
        /**  Allows an application to initiate a phone call without going through
         the Dialer user interface for the user to confirm the call
         being placed. 
         */
        public static final String CALL_PHONE="android.permission.CALL_PHONE";
        /**  Allows an application to call any phone number, including emergency
         numbers, without going through the Dialer user interface for the user
         to confirm the call being placed. 
         */
        public static final String CALL_PRIVILEGED="android.permission.CALL_PRIVILEGED";
        /**  Required to be able to access the camera device.
         <p>This will automatically enforce the <a
         href="{@docRoot}guide/topics/manifest/uses-feature-element.html">{@code
         &lt;uses-feature&gt;}</a> manifest element for <em>all</em> camera features.
         If you do not require all camera features or can properly operate if a camera
         is not available, then you must modify your manifest as appropriate in order to
         install on devices that don't support all camera features.</p> 
         */
        public static final String CAMERA="android.permission.CAMERA";
        /**  Allows applications to change the background data setting
         @hide pending API council 
         */
        public static final String CHANGE_BACKGROUND_DATA_SETTING="android.permission.CHANGE_BACKGROUND_DATA_SETTING";
        /**  Allows an application to change whether an application component (other than its own) is
         enabled or not. 
         */
        public static final String CHANGE_COMPONENT_ENABLED_STATE="android.permission.CHANGE_COMPONENT_ENABLED_STATE";
        /**  Allows an application to modify the current configuration, such
         as locale. 
         */
        public static final String CHANGE_CONFIGURATION="android.permission.CHANGE_CONFIGURATION";
        /**  Allows applications to change network connectivity state 
         */
        public static final String CHANGE_NETWORK_STATE="android.permission.CHANGE_NETWORK_STATE";
        /**  Allows applications to enter Wi-Fi Multicast mode 
         */
        public static final String CHANGE_WIFI_MULTICAST_STATE="android.permission.CHANGE_WIFI_MULTICAST_STATE";
        /**  Allows applications to change Wi-Fi connectivity state 
         */
        public static final String CHANGE_WIFI_STATE="android.permission.CHANGE_WIFI_STATE";
        /**  Allows an application to clear the caches of all installed
         applications on the device.  
         */
        public static final String CLEAR_APP_CACHE="android.permission.CLEAR_APP_CACHE";
        /**  Allows an application to clear user data 
         */
        public static final String CLEAR_APP_USER_DATA="android.permission.CLEAR_APP_USER_DATA";
        /**  Allows a package to launch the secure full-backup confirmation UI.
         ONLY the system process may hold this permission.
         @hide 
         */
        public static final String CONFIRM_FULL_BACKUP="android.permission.CONFIRM_FULL_BACKUP";
        /**  Allows an internal user to use privaledged ConnectivityManager
    APIs.
        @hide 
         */
        public static final String CONNECTIVITY_INTERNAL="android.permission.CONNECTIVITY_INTERNAL";
        /**  Allows enabling/disabling location update notifications from
         the radio. Not for use by normal applications. 
         */
        public static final String CONTROL_LOCATION_UPDATES="android.permission.CONTROL_LOCATION_UPDATES";
        /**  Must be required by default container service so that only
         the system can bind to it and use it to copy
         protected data to secure containers or files
         accessible to the system.
         @hide 
         */
        public static final String COPY_PROTECTED_DATA="android.permission.COPY_PROTECTED_DATA";
        /**  Internal permission protecting access to the encryption methods
        @hide
    
         */
        public static final String CRYPT_KEEPER="android.permission.CRYPT_KEEPER";
        /**  Allows an application to delete cache files. 
         */
        public static final String DELETE_CACHE_FILES="android.permission.DELETE_CACHE_FILES";
        /**  Allows an application to delete packages. 
         */
        public static final String DELETE_PACKAGES="android.permission.DELETE_PACKAGES";
        /**  Allows low-level access to power management 
         */
        public static final String DEVICE_POWER="android.permission.DEVICE_POWER";
        /**  Allows applications to RW to diagnostic resources. 
         */
        public static final String DIAGNOSTIC="android.permission.DIAGNOSTIC";
        /**  Allows applications to disable the keyguard 
         */
        public static final String DISABLE_KEYGUARD="android.permission.DISABLE_KEYGUARD";
        /**  Allows an application to retrieve state dump information from system
         services. 
         */
        public static final String DUMP="android.permission.DUMP";
        /**  Allows an application to expand or collapse the status bar. 
         */
        public static final String EXPAND_STATUS_BAR="android.permission.EXPAND_STATUS_BAR";
        /**  Run as a manufacturer test application, running as the root user.
         Only available when the device is running in manufacturer test mode. 
         */
        public static final String FACTORY_TEST="android.permission.FACTORY_TEST";
        /**  Allows access to the flashlight 
         */
        public static final String FLASHLIGHT="android.permission.FLASHLIGHT";
        /**  Allows an application to force a BACK operation on whatever is the
         top activity. 
         */
        public static final String FORCE_BACK="android.permission.FORCE_BACK";
        /**  Allows an application to call
        {@link android.app.ActivityManager#forceStopPackage}.
        @hide 
         */
        public static final String FORCE_STOP_PACKAGES="android.permission.FORCE_STOP_PACKAGES";
        /**  Allows access to the list of accounts in the Accounts Service 
         */
        public static final String GET_ACCOUNTS="android.permission.GET_ACCOUNTS";
        /**  Allows an application to find out the space used by any package. 
         */
        public static final String GET_PACKAGE_SIZE="android.permission.GET_PACKAGE_SIZE";
        /**  Allows an application to get information about the currently
         or recently running tasks: a thumbnail representation of the tasks,
         what activities are running in it, etc. 
         */
        public static final String GET_TASKS="android.permission.GET_TASKS";
        /**  This permission can be used on content providers to allow the global
         search system to access their data.  Typically it used when the
         provider has some permissions protecting it (which global search
         would not be expected to hold), and added as a read-only permission
         to the path in the provider where global search queries are
         performed.  This permission can not be held by regular applications;
         it is used by applications to protect themselves from everyone else
         besides global search. 
         */
        public static final String GLOBAL_SEARCH="android.permission.GLOBAL_SEARCH";
        /**  Internal permission protecting access to the global search
         system: ensures that only the system can access the provider
         to perform queries (since this otherwise provides unrestricted
         access to a variety of content providers), and to write the
         search statistics (to keep applications from gaming the source
         ranking).
         @hide 
         */
        public static final String GLOBAL_SEARCH_CONTROL="android.permission.GLOBAL_SEARCH_CONTROL";
        /**  Allows access to hardware peripherals.  Intended only for hardware testing 
         */
        public static final String HARDWARE_TEST="android.permission.HARDWARE_TEST";
        /**  Allows an application to inject user events (keys, touch, trackball)
         into the event stream and deliver them to ANY window.  Without this
         permission, you can only deliver events to windows in your own process.
         Very few applications should need to use this permission. 
         */
        public static final String INJECT_EVENTS="android.permission.INJECT_EVENTS";
        /**  Allows an application to install a location provider into the Location Manager 
         */
        public static final String INSTALL_LOCATION_PROVIDER="android.permission.INSTALL_LOCATION_PROVIDER";
        /**  Allows an application to install packages. 
         */
        public static final String INSTALL_PACKAGES="android.permission.INSTALL_PACKAGES";
        /**  Allows an application to open windows that are for use by parts
         of the system user interface.  Not for use by third party apps. 
         */
        public static final String INTERNAL_SYSTEM_WINDOW="android.permission.INTERNAL_SYSTEM_WINDOW";
        /**  Allows applications to open network sockets. 
         */
        public static final String INTERNET="android.permission.INTERNET";
        /**  Allows an application to call
        {@link android.app.ActivityManager#killBackgroundProcesses}. 
         */
        public static final String KILL_BACKGROUND_PROCESSES="android.permission.KILL_BACKGROUND_PROCESSES";
        /**  Allows an application to manage the list of accounts in the AccountManager 
         */
        public static final String MANAGE_ACCOUNTS="android.permission.MANAGE_ACCOUNTS";
        /**  Allows an application to manage (create, destroy,
         Z-order) application tokens in the window manager.  This is only
         for use by the system. 
         */
        public static final String MANAGE_APP_TOKENS="android.permission.MANAGE_APP_TOKENS";
        /**  Allows an application to manage network policies (such as warning and disable
         limits) and to define application-specific rules. @hide 
         */
        public static final String MANAGE_NETWORK_POLICY="android.permission.MANAGE_NETWORK_POLICY";
        /**  Allows an application to manage preferences and permissions for USB devices
         @hide 
         */
        public static final String MANAGE_USB="android.permission.MANAGE_USB";
        public static final String MASTER_CLEAR="android.permission.MASTER_CLEAR";
        /**  Allows an application to modify global audio settings 
         */
        public static final String MODIFY_AUDIO_SETTINGS="android.permission.MODIFY_AUDIO_SETTINGS";
        /**  Allows an application to account its network traffic against other UIDs. Used
         by system services like download manager and media server. Not for use by
         third party apps. @hide 
         */
        public static final String MODIFY_NETWORK_ACCOUNTING="android.permission.MODIFY_NETWORK_ACCOUNTING";
        /**  Allows modification of the telephony state - power on, mmi, etc.
         Does not include placing calls. 
         */
        public static final String MODIFY_PHONE_STATE="android.permission.MODIFY_PHONE_STATE";
        /**  Allows formatting file systems for removable storage. 
         */
        public static final String MOUNT_FORMAT_FILESYSTEMS="android.permission.MOUNT_FORMAT_FILESYSTEMS";
        /**  Allows mounting and unmounting file systems for removable storage. 
         */
        public static final String MOUNT_UNMOUNT_FILESYSTEMS="android.permission.MOUNT_UNMOUNT_FILESYSTEMS";
        /**  Allows an application to move location of installed package.
         @hide 
         */
        public static final String MOVE_PACKAGE="android.permission.MOVE_PACKAGE";
        /**  Allows access to configure network interfaces, configure/use IPSec, etc.
         @hide 
         */
        public static final String NET_ADMIN="android.permission.NET_ADMIN";
        /**  Allows applications to perform I/O operations over NFC 
         */
        public static final String NFC="android.permission.NFC";
        /**  Allows an application to collect component usage
         statistics @hide 
         */
        public static final String PACKAGE_USAGE_STATS="android.permission.PACKAGE_USAGE_STATS";
        /**  Package verifier needs to have this permission before the PackageManager will
         trust it to verify packages.
         @hide
    
         */
        public static final String PACKAGE_VERIFICATION_AGENT="android.permission.PACKAGE_VERIFICATION_AGENT";
        /**  Allows an application to perform CDMA OTA provisioning @hide 
         */
        public static final String PERFORM_CDMA_PROVISIONING="android.permission.PERFORM_CDMA_PROVISIONING";
        /**  @deprecated This functionality will be removed in the future; please do
         not use.

         Allow an application to make its activities persistent. 
         */
        @Deprecated
        public static final String PERSISTENT_ACTIVITY="android.permission.PERSISTENT_ACTIVITY";
        /**  Allows an application to monitor, modify, or abort outgoing
         calls. 
         */
        public static final String PROCESS_OUTGOING_CALLS="android.permission.PROCESS_OUTGOING_CALLS";
        /**  Allows an application to read the user's calendar data. 
         */
        public static final String READ_CALENDAR="android.permission.READ_CALENDAR";
        /**  Allows an application to read the user's contacts data. 
         */
        public static final String READ_CONTACTS="android.permission.READ_CONTACTS";
        /**  Allows an application to take screen shots and more generally
         get access to the frame buffer data 
         */
        public static final String READ_FRAME_BUFFER="android.permission.READ_FRAME_BUFFER";
        /**  Allows an application to read (but not write) the user's
        browsing history and bookmarks. 
         */
        public static final String READ_HISTORY_BOOKMARKS="com.android.browser.permission.READ_HISTORY_BOOKMARKS";
        /**  Allows an application to retrieve the current state of keys and
         switches.  This is only for use by the system.
         */
        public static final String READ_INPUT_STATE="android.permission.READ_INPUT_STATE";
        /**  Allows an application to read the low-level system log files.
         Log entries can contain the user's private information,
         which is why this permission is 'dangerous'. 
         */
        public static final String READ_LOGS="android.permission.READ_LOGS";
        /**  Allows an application to read historical network usage for
         specific networks and applications. @hide 
         */
        public static final String READ_NETWORK_USAGE_HISTORY="android.permission.READ_NETWORK_USAGE_HISTORY";
        /**  Allows read only access to phone state. 
         */
        public static final String READ_PHONE_STATE="android.permission.READ_PHONE_STATE";
        /**  Allows read access to privileged phone state.
         @hide Used internally. 
         */
        public static final String READ_PRIVILEGED_PHONE_STATE="android.permission.READ_PRIVILEGED_PHONE_STATE";
        /**  Allows an application to read the user's personal profile data. 
         */
        public static final String READ_PROFILE="android.permission.READ_PROFILE";
        /**  Allows an application to read SMS messages. 
         */
        public static final String READ_SMS="android.permission.READ_SMS";
        /**  Allows an application to read from the user's social stream.
         @hide 
         */
        public static final String READ_SOCIAL_STREAM="android.permission.READ_SOCIAL_STREAM";
        /**  Allows applications to read the sync settings 
         */
        public static final String READ_SYNC_SETTINGS="android.permission.READ_SYNC_SETTINGS";
        /**  Allows applications to read the sync stats 
         */
        public static final String READ_SYNC_STATS="android.permission.READ_SYNC_STATS";
        /**  Allows an application to read the user dictionary. This should
         really only be required by an IME, or a dictionary editor like
         the Settings app.
         @hide Pending API council approval 
         */
        public static final String READ_USER_DICTIONARY="android.permission.READ_USER_DICTIONARY";
        /**  Required to be able to reboot the device. 
         */
        public static final String REBOOT="android.permission.REBOOT";
        /**  Allows an application to receive the
         {@link android.content.Intent#ACTION_BOOT_COMPLETED} that is
         broadcast after the system finishes booting.  If you don't
         request this permission, you will not receive the broadcast at
         that time.  Though holding this permission does not have any
         security implications, it can have a negative impact on the
         user experience by increasing the amount of time it takes the
         system to start and allowing applications to have themselves
         running without the user being aware of them.  As such, you must
         explicitly declare your use of this facility to make that visible
         to the user. 
         */
        public static final String RECEIVE_BOOT_COMPLETED="android.permission.RECEIVE_BOOT_COMPLETED";
        /**  Allows an application to receive emergency cell broadcast messages,
         to record or display them to the user. Reserved for system apps.
         @hide Pending API council approval 
         */
        public static final String RECEIVE_EMERGENCY_BROADCAST="android.permission.RECEIVE_EMERGENCY_BROADCAST";
        /**  Allows an application to monitor incoming MMS messages, to record
         or perform processing on them. 
         */
        public static final String RECEIVE_MMS="android.permission.RECEIVE_MMS";
        /**  Allows an application to monitor incoming SMS messages, to record
         or perform processing on them. 
         */
        public static final String RECEIVE_SMS="android.permission.RECEIVE_SMS";
        /**  Allows an application to monitor incoming WAP push messages. 
         */
        public static final String RECEIVE_WAP_PUSH="android.permission.RECEIVE_WAP_PUSH";
        /**  Allows an application to record audio 
         */
        public static final String RECORD_AUDIO="android.permission.RECORD_AUDIO";
        /**  @hide Allows an application to change to remove/kill tasks 
         */
        public static final String REMOVE_TASKS="android.permission.REMOVE_TASKS";
        /**  Allows an application to change the Z-order of tasks 
         */
        public static final String REORDER_TASKS="android.permission.REORDER_TASKS";
        /**  @deprecated The {@link android.app.ActivityManager#restartPackage}
        API is no longer supported. 
         */
        @Deprecated
        public static final String RESTART_PACKAGES="android.permission.RESTART_PACKAGES";
        /**  @hide Allows an application to retrieve the content of the active window
         An active window is the window that has fired an accessibility event. 
         */
        public static final String RETRIEVE_WINDOW_CONTENT="android.permission.RETRIEVE_WINDOW_CONTENT";
        /**  Allows an application to send SMS messages. 
         */
        public static final String SEND_SMS="android.permission.SEND_SMS";
        /**  Allows an application to send SMS messages via the Messaging app with no user
         input or confirmation.
         @hide 
         */
        public static final String SEND_SMS_NO_CONFIRMATION="android.permission.SEND_SMS_NO_CONFIRMATION";
        /**  Allows an application to watch and control how activities are
         started globally in the system.  Only for is in debugging
         (usually the monkey command). 
         */
        public static final String SET_ACTIVITY_WATCHER="android.permission.SET_ACTIVITY_WATCHER";
        /**  Allows an application to broadcast an Intent to set an alarm for the
         user. 
         */
        public static final String SET_ALARM="com.android.alarm.permission.SET_ALARM";
        /**  Allows an application to control whether activities are immediately
         finished when put in the background. 
         */
        public static final String SET_ALWAYS_FINISH="android.permission.SET_ALWAYS_FINISH";
        /**  Modify the global animation scaling factor. 
         */
        public static final String SET_ANIMATION_SCALE="android.permission.SET_ANIMATION_SCALE";
        /**  Configure an application for debugging. 
         */
        public static final String SET_DEBUG_APP="android.permission.SET_DEBUG_APP";
        /**  Allows low-level access to setting the orientation (actually
         rotation) of the screen.  Not for use by normal applications. 
         */
        public static final String SET_ORIENTATION="android.permission.SET_ORIENTATION";
        /**  Allows low-level access to setting the pointer speed.
         Not for use by normal applications. 
         */
        public static final String SET_POINTER_SPEED="android.permission.SET_POINTER_SPEED";
        /**  @deprecated No longer useful, see
         {@link android.content.pm.PackageManager#addPackageToPreferred}
         for details. 
         */
        @Deprecated
        public static final String SET_PREFERRED_APPLICATIONS="android.permission.SET_PREFERRED_APPLICATIONS";
        /**  Allows an application to set the maximum number of (not needed)
         application processes that can be running. 
         */
        public static final String SET_PROCESS_LIMIT="android.permission.SET_PROCESS_LIMIT";
        /**  Allows applications to set the system time 
         */
        public static final String SET_TIME="android.permission.SET_TIME";
        /**  Allows applications to set the system time zone 
         */
        public static final String SET_TIME_ZONE="android.permission.SET_TIME_ZONE";
        /**  Allows applications to set the wallpaper 
         */
        public static final String SET_WALLPAPER="android.permission.SET_WALLPAPER";
        /**  Allows applications to set a live wallpaper.
         @hide XXX Change to signature once the picker is moved to its
         own apk as Ghod Intended. 
         */
        public static final String SET_WALLPAPER_COMPONENT="android.permission.SET_WALLPAPER_COMPONENT";
        /**  Allows applications to set the wallpaper hints 
         */
        public static final String SET_WALLPAPER_HINTS="android.permission.SET_WALLPAPER_HINTS";
        /**  Allows an application to call the activity manager shutdown() API
         to put the higher-level system there into a shutdown state.
         @hide 
         */
        public static final String SHUTDOWN="android.permission.SHUTDOWN";
        /**  Allow an application to request that a signal be sent to all persistent processes 
         */
        public static final String SIGNAL_PERSISTENT_PROCESSES="android.permission.SIGNAL_PERSISTENT_PROCESSES";
        /**  Allows an application to open, close, or disable the status bar
         and its icons. 
         */
        public static final String STATUS_BAR="android.permission.STATUS_BAR";
        /**  Allows an application to be the status bar.  Currently used only by SystemUI.apk
    @hide 
         */
        public static final String STATUS_BAR_SERVICE="android.permission.STATUS_BAR_SERVICE";
        /**  Allows an application to tell the activity manager to temporarily
         stop application switches, putting it into a special mode that
         prevents applications from immediately switching away from some
         critical UI such as the home screen.
         @hide 
         */
        public static final String STOP_APP_SWITCHES="android.permission.STOP_APP_SWITCHES";
        /**  Allows an application to allow access the subscribed feeds
         ContentProvider. 
         */
        public static final String SUBSCRIBED_FEEDS_READ="android.permission.SUBSCRIBED_FEEDS_READ";
        public static final String SUBSCRIBED_FEEDS_WRITE="android.permission.SUBSCRIBED_FEEDS_WRITE";
        /**  Allows an application to open windows using the type
         {@link android.view.WindowManager.LayoutParams#TYPE_SYSTEM_ALERT},
         shown on top of all other applications.  Very few applications
         should use this permission; these windows are intended for
         system-level interaction with the user. 
         */
        public static final String SYSTEM_ALERT_WINDOW="android.permission.SYSTEM_ALERT_WINDOW";
        /**  Allows an application to update device statistics. Not for
         use by third party apps. 
         */
        public static final String UPDATE_DEVICE_STATS="android.permission.UPDATE_DEVICE_STATS";
        /**  Allows an application to request authtokens from the AccountManager 
         */
        public static final String USE_CREDENTIALS="android.permission.USE_CREDENTIALS";
        /**  Allows an application to use SIP service 
         */
        public static final String USE_SIP="android.permission.USE_SIP";
        /**  Allows access to the vibrator 
         */
        public static final String VIBRATE="android.permission.VIBRATE";
        /**  Allows using PowerManager WakeLocks to keep processor from sleeping or screen
         from dimming 
         */
        public static final String WAKE_LOCK="android.permission.WAKE_LOCK";
        /**  Allows applications to write the apn settings 
         */
        public static final String WRITE_APN_SETTINGS="android.permission.WRITE_APN_SETTINGS";
        /**  Allows an application to write (but not read) the user's
         calendar data. 
         */
        public static final String WRITE_CALENDAR="android.permission.WRITE_CALENDAR";
        /**  Allows an application to write (but not read) the user's
         contacts data. 
         */
        public static final String WRITE_CONTACTS="android.permission.WRITE_CONTACTS";
        /**  Allows an application to write to external storage 
         */
        public static final String WRITE_EXTERNAL_STORAGE="android.permission.WRITE_EXTERNAL_STORAGE";
        /**  Allows an application to modify the Google service map. 
         */
        public static final String WRITE_GSERVICES="android.permission.WRITE_GSERVICES";
        /**  Allows an application to write (but not read) the user's
        browsing history and bookmarks. 
         */
        public static final String WRITE_HISTORY_BOOKMARKS="com.android.browser.permission.WRITE_HISTORY_BOOKMARKS";
        /**  Allows an application to write to internal media storage
         @hide  
         */
        public static final String WRITE_MEDIA_STORAGE="android.permission.WRITE_MEDIA_STORAGE";
        /**  Allows an application to write (but not read) the user's
         personal profile data. 
         */
        public static final String WRITE_PROFILE="android.permission.WRITE_PROFILE";
        /**  Allows an application to read or write the secure system settings. 
         */
        public static final String WRITE_SECURE_SETTINGS="android.permission.WRITE_SECURE_SETTINGS";
        /**  Allows an application to read or write the system settings. 
         */
        public static final String WRITE_SETTINGS="android.permission.WRITE_SETTINGS";
        /**  Allows an application to write SMS messages. 
         */
        public static final String WRITE_SMS="android.permission.WRITE_SMS";
        /**  Allows an application to write (but not read) the user's
         social stream data.
         @hide 
         */
        public static final String WRITE_SOCIAL_STREAM="android.permission.WRITE_SOCIAL_STREAM";
        /**  Allows applications to write the sync settings 
         */
        public static final String WRITE_SYNC_SETTINGS="android.permission.WRITE_SYNC_SETTINGS";
        /**  Allows an application to write to the user dictionary.
         @hide Pending API council approval 
         */
        public static final String WRITE_USER_DICTIONARY="android.permission.WRITE_USER_DICTIONARY";
    }
    public static final class permission_group {
        /**  Permissions for direct access to the accounts managed
         by the Account Manager. 
         */
        public static final String ACCOUNTS="android.permission-group.ACCOUNTS";
        /**  Used for permissions that can be used to make the user spend money
         without their direct involvement.  For example, this is the group
         for permissions that allow you to directly place phone calls,
         directly send SMS messages, etc. 
         */
        public static final String COST_MONEY="android.permission-group.COST_MONEY";
        /**  Group of permissions that are related to development features.  These
         are not permissions that should appear in normal applications; they
         protect APIs that are intended only to be used for development
         purposes. 
         */
        public static final String DEVELOPMENT_TOOLS="android.permission-group.DEVELOPMENT_TOOLS";
        /**  Used for permissions that provide direct access to the hardware on
         the device.  This includes audio, the camera, vibrator, etc. 
         */
        public static final String HARDWARE_CONTROLS="android.permission-group.HARDWARE_CONTROLS";
        /**  Used for permissions that allow access to the user's current
         location. 
         */
        public static final String LOCATION="android.permission-group.LOCATION";
        /**  Used for permissions that allow an application to send messages
         on behalf of the user or intercept messages being received by the
         user.  This is primarily intended for SMS/MMS messaging, such as
         receiving or reading an MMS. 
         */
        public static final String MESSAGES="android.permission-group.MESSAGES";
        /**  Used for permissions that provide access to networking services.  The
         main permission here is internet access, but this is also an
         appropriate group for accessing or modifying any network configuration
         or other related network operations. 
         */
        public static final String NETWORK="android.permission-group.NETWORK";
        /**  Used for permissions that provide access to the user's private data,
         such as contacts, calendar events, e-mail messages, etc.  This includes
         both reading and writing of this data (which should generally be
         expressed as two distinct permissions). 
         */
        public static final String PERSONAL_INFO="android.permission-group.PERSONAL_INFO";
        /**  Used for permissions that are associated with accessing and modifyign
         telephony state: intercepting outgoing calls, reading
         and modifying the phone state.  Note that
         placing phone calls is not in this group, since that is in the
         more important "takin' yer moneys" group. 
         */
        public static final String PHONE_CALLS="android.permission-group.PHONE_CALLS";
        /**  Group of permissions that are related to SD card access. 
         */
        public static final String STORAGE="android.permission-group.STORAGE";
        /**  Group of permissions that are related to system APIs.  Many
         of these are not permissions the user will be expected to understand,
         and such permissions should generally be marked as "normal" protection
         level so they don't get displayed.  This can also, however, be used
         for miscellaneous features that provide access to the operating system,
         such as writing the global system settings. 
         */
        public static final String SYSTEM_TOOLS="android.permission-group.SYSTEM_TOOLS";
    }
}
