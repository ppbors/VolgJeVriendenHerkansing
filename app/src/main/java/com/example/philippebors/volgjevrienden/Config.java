package com.example.philippebors.volgjevrienden;


/* This class contains some urls and tags to be used in requests and JSON strings */
class Config {
    /* PHP URLS */
    public static final String GET_FRIENDS_URL = "http://nolden.biz/Android/getFriends.php";
    public static final String LOGIN_ACCOUNT_URL = "http://nolden.biz/Android/loginAccount.php";
    public static final String REGISTER_URL = "http://nolden.biz/Android/registerAccount.php";
    public static final String FRIEND_URL = "http://nolden.biz/Android/addFriendship.php";
    public static final String FRIENDS_LOCATIONS_SEND_URL = "http://nolden.biz/Android/getLocations.php";
    public static final String UPDATE_LOCATIONS_URL = "http://nolden.biz/Android/updateLocation.php";
    public static final String GO_DARK_URL = "http://nolden.biz/Android/goDark.php";
    public static final String DELETE_FRIEND_URL = "http://nolden.biz/Android/deleteFriendship.php";

    /* TXT URLS */
    public static final String LOGIN_STATUS_URL = "http://nolden.biz/Android/response/";
    public static final String FRIENDS_LOCATIONS_URL = "http://nolden.biz/Android/response/";
    public static final String CHECK_FRIENDS_URL = "http://nolden.biz/Android/response/";
    public static final String REGISTER_STATUS_URL = "http://nolden.biz/Android/response/";
    public static final String GET_LINK_URL = "http://nolden.biz/Android/response/";

    /* Number of the user that logged in */
    public static String MY_NUMBER = "";
    public static String MY_LINK = "";


    /* Tags used in JSON strings */
    public static final String TAG_NAME = "NAME";
    public static final String TAG_LONGITUDE = "LONGITUDE";
    public static final String TAG_LATITUDE = "LATITUDE";
    public static final String TAG_LINK = "LINK";


    /* Name of the JSON array */
    public static final String JSON_ARRAY = "result";
}