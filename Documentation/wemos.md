#HARDWARE ARCHITECTURE
This section outlines the primary hardware components used to construct the Wi-Fi smart interface module for the Bosch/Midea Air Conditioning unit.
##Component Overview
    **Wemos D1 Mini v4** -The main microcontroller ("brain") that processes data and connects to Wi-Fi.
    **Bidirectional Logic Level Converter** -Safely translates data signals between the 5V AC unit and the 3.3V microcontroller.
    **USB-A Connector** -Safely translates data signals between the 5V AC unit and the 3.3V microcontroller.
##Circuit Interconnections
    ###1.Power Distribution
    * **AC-Port Pin 1 to USB-A Pin 1 (VCC/5V Line):** - The air conditioner motherboard natively outputs a stable **5V** DC power supply on its interface connector. This line acts as the main power source for the entire custom module, completely removing the need for external power supplies or battery packs.
    **USB-A Pin 1 to Converter HV & Wemos 5V Pin:** - The Wemos D1 Mini requires a **5V** input on its raw power pin to pass through its internal voltage regulator, which converts it down to power the onboard Wi-Fi chip. Simultaneously, the Logic Level Converter requires this same **5V** source on its **HV (High Voltage)** pin to establish an electrical reference ceiling for the high-side logic data signals.
    **Wemos 3V3 Pin to Converter LV Pin:** - The Wemos board outputs its own stable **3.3V** power reference from its internal regulator. This is connected directly to the converter's **LV (Low Voltage)** pin to tell the converter exactly what voltage level the microcontroller's communication pins operate on.
    **Shared Ground Network (GND to GND to GND):** - Ground represents the zero-volt (**0V**) reference baseline for the entire project. If any of the ground connections between the AC unit, the converter, or the Wemos are left disconnected, the voltages of the data signals will float unpredictably, causing corrupt data transmissions or connection errors. Combining all ground pins into a unified loop ensures all components measure signals from the exact same baseline.
###Paths
####The transmit path
    **Pins Used:** `Wemos TX` → `Converter LV1` → `Converter HV1` → `USB-A Pin 2 (TX-AC)` → `AC-Port Pin 2`.
####The receive path
    **Pins Used:** `AC-Port Pin 3` → `USB-A Pin 3 (RX-AC)` → `Converter HV2` → `Converter LV2` → `Wemos RX`.