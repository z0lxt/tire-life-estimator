Tire Life Estimator

A simple Java console app that estimates how much life a tire has left, and tells you whether it's time to replace it

What it Does

The app asks a few question about your tire and vehicle and then:

Tells you if your tire has reached its typical safe limit and should be replaced
If not estimated how many more kilometers and years you can expect to use it at maximum

Current Features

Adjusts tire life expectation if you own heavy SUV or electrical vehicle (these tend to wear tires faster, so limits are reduced)

Takes inputs for:

Years the tire has been in use

Kilometers driven on the tire

Compares against baseline limits

80,000 km / 10 years for standard vehicles

Reduced limits (85% of baseline) for heavy SUVs / EVs

How to Run It

1. Clone this repo or download Main.java

2. Compile:
javac Main.java

3. Run:
java Main

4. Answer the prompts in the console

Planned Features

Factor in specific road types (highway, city, rough, etc.)

Factor in different vehicle types beyond "heavy SUB/EV vs standard"

Track multiple tires at once

Save results to a file so history isn't lost between runs

Maybe create a simple GUI version