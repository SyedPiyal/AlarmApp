# AlarmApp

A simple Android application that allows the user to set an alarm which plays the default ringtone after a specified delay. The app demonstrates the use of `BroadcastReceiver`, `MediaPlayer`, `AlarmManager`, and basic UI components in Android.

## Features:
- User can input a time delay in minutes.
- The alarm rings using the default ringtone after the specified time.
- The ringtone stops after 5 seconds automatically.
- The app utilizes `AlarmManager` to trigger the alarm at a specified time.
- Supports edge-to-edge UI for a modern look.

## Technologies Used:
- **Kotlin**: Main programming language.
- **Android SDK**: For building the mobile application.
- **MediaPlayer**: For playing the ringtone.
- **AlarmManager**: For scheduling the alarm.
- **BroadcastReceiver**: For receiving the alarm event and triggering the ringtone.
- **Handler**: To stop the ringtone after 5 seconds.
- **Edge-to-Edge UI**: For modern visual design using `ViewCompat`.

## How to Use:
1. Clone or download the repository.
2. Open the project in Android Studio.
3. Run the app on an Android device or emulator.
4. Enter the number of minutes you want to set the alarm for.
5. Press the "Start" button to set the alarm.
6. After the specified time, the default ringtone will play, and it will stop after 5 seconds.

## Setting the Alarm:
- The alarm is set using `AlarmManager` and is triggered based on the specified time in minutes.
- When the alarm goes off, the ringtone plays for 5 seconds using `MediaPlayer`.
  
## Future Enhancements:
- Allow the user to choose a custom ringtone.
- Add a feature to snooze the alarm.
- Allow setting the alarm for specific times or recurring alarms.
- Add vibration or sound duration options.

## License:
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments:
- Android documentation for providing extensive resources to build this app.
