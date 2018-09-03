using System;
using Android.App;
using Android.Content;
using Android.Runtime;
using BranchXamarinSDK;

namespace TestXamarinFormsApp.Droid
{

	[Application(AllowBackup = true, Icon = "@drawable/icon", Label = "@string/app_name")]
	[MetaData("io.branch.sdk.auto_link_disable", Value = "false")]
	[MetaData("io.branch.sdk.TestMode", Value = "true")]
	[MetaData("io.branch.sdk.BranchKey", Value = "@string/branch_key")]

	public class App : Application
	{
		public App(IntPtr javaReference, JniHandleOwnership transfer) : base(javaReference, transfer)
		{
		}

		public override void OnCreate()
		{
			base.OnCreate();
			BranchAndroid.GetAutoInstance(this.ApplicationContext);
		}
	}
}