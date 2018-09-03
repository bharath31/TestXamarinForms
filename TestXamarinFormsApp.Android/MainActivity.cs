using System;

using Android.App;
using Android.Content;
using Android.Content.PM;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;

using BranchXamarinSDK;
using TestXamarinFormsApp;

namespace TestXamarinFormsApp.Droid
{
	[Activity(Label = "TestXamarinFormsApp.Droid", LaunchMode = LaunchMode.SingleTask, Icon = "@drawable/icon", Theme = "@style/MyTheme", MainLauncher = true, ConfigurationChanges = ConfigChanges.ScreenSize | ConfigChanges.Orientation)]

	[IntentFilter(new[] { "android.intent.action.VIEW" },
		Categories = new[] { "android.intent.category.DEFAULT", "android.intent.category.BROWSABLE" },
		DataScheme = "eagleeye",
		DataHost = "open")]

	[IntentFilter(new[] { "android.intent.action.VIEW" },
		Categories = new[] { "android.intent.category.DEFAULT", "android.intent.category.BROWSABLE" },
		DataScheme = "https",
		DataHost = "eagle.app.link")]

	public class MainActivity : global::Xamarin.Forms.Platform.Android.FormsApplicationActivity
	{
		protected override void OnCreate(Bundle savedInstanceState)
		{
			base.OnCreate(savedInstanceState);

			global::Xamarin.Forms.Forms.Init(this, savedInstanceState);

			TestXamarinFormsAppBUO linkData = new TestXamarinFormsAppBUO();
			BranchAndroid.Init(this, GetString(Resource.String.branch_key), linkData);
			LoadApplication(linkData);

			// latest
			System.Collections.Generic.Dictionary<string, object> sessionParams = Branch.GetInstance().GetLastReferringParams();

			// first
			System.Collections.Generic.Dictionary<string, object> installParams = Branch.GetInstance().GetFirstReferringParams();


		}

		protected override void OnNewIntent(Intent intent)
		{
			this.Intent = intent;
		}
	}
}