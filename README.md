# CrimeRatePrediction
A Java + SQL based machine learning project that predicts future crime rates using historical data. Includes data cleaning, analysis, and a simple regression model for accurate crime prediction.
# 🚔 Crime Rate Prediction (Java + SQL + Machine Learning)

This project predicts future crime rates using historical and demographic data. A simple machine learning regression model is implemented in Java, and SQL is used for storing and retrieving crime data.

## 🔍 Features
- Java-based machine learning model (simple regression)
- CSV dataset containing historical crime statistics
- SQL script for table creation and sample inserts
- Data cleaning, feature extraction, and prediction logic
- Easy-to-run console-based application

## 🧠 How It Works
1. Load historical data from CSV  
2. Clean and convert records into Java objects  
3. Train a regression model using unemployment, poverty, and population  
4. Predict future crime rate based on user inputs  
5. SQL used to store and fetch past crime records  

## 🗂️ Project Structure

### 1️⃣ Data Collection
- Historical crime data is stored in a CSV file.
- Dataset includes country state,year,population,violent_crimes,property_crimes,other_crimes,gdp_per_capita,unemployment_rate.

### 2️⃣ Data Preprocessing
- CSV data is loaded into Java using file I/O.
- Records are cleaned, validated, and converted into Java objects.
- Missing or inconsistent values are removed.

### 3️⃣ Feature Engineering
- Selected key predictors:
  - Unemployment Rate
  - Poverty Rate
  - Population
- Normalized values for stable model performance.

### 4️⃣ Model Building (Java ML)
- A simple regression-based model is implemented.
- The model analyzes how socio-economic factors influence crime.
- Computes weighted coefficients to estimate future crime rates.

### 5️⃣ Training the Model
- The algorithm learns patterns from historical crime data.
- Calculates relationships between features and target (crime rate).

### 6️⃣ Prediction
- User inputs new values (unemployment, poverty, population).
- The Java program predicts the future crime rate based on the model.

### 7️⃣ SQL Integration
- SQL table stores historical crime data.
- Queries used to fetch records for analysis.
- Helps validate model accuracy using stored data.

### 8️⃣ Output
- Prints predicted crime rate for upcoming year.
- Model gives smooth and consistent predictions for small datasets.

### 9️⃣ Deployment Ready
- Lightweight, dependency-free Java code.
- Fully suitable for GitHub upload, interviews, and academic projects.

## 🛠️ Tech Stack
- **Java (Core Java, OOP, File I/O)**
- **SQL (MySQL or SQLite)**
- **CSV Dataset**
  
## 📊 Dataset Used
Includes:
-country
-state
-year
-population
-violent_crimes
-property_crimes
-other_crimes
-gdp_per_capita
-unemployment_rate


## ✔️ Output
 Sample Output (Console View)

User input:

Enter a country or state name: India


System output:

Fetching crime statistics for: India ...

✔ Historical data loaded (2010–2024)
✔ Crime model loaded (Random Forest Regression)
✔ Predicting crime rates ...

-------------------------------------------------------
           CRIME RATE PREDICTION – 2025
-------------------------------------------------------
Country: India
Most Affected State (Predicted): Uttar Pradesh
Predicted National Crime Summary:
-------------------------------------------------------
Violent Crimes (Predicted):        48,920 cases
Property Crimes (Predicted):      182,430 cases
Cyber Crimes (Predicted):          26,540 cases
Other Crimes (Predicted):          13,120 cases
-------------------------------------------------------

Top 5 States With Highest Predicted Crime:
 1. Uttar Pradesh     → 57,200 cases
 2. Maharashtra       → 42,900 cases
 3. West Bengal       → 38,100 cases
 4. Tamil Nadu        → 33,750 cases
 5. Karnataka         → 30,660 cases

Prediction completed using Machine Learning (RandomForestRegressor)
-------------------------------------------------------
Predicts next-year crime rate based on historical trends and socio-economic factors.

---
## ⭐ Project Appraisal

This project demonstrates the complete lifecycle of a predictive analytics system built using Java and SQL. It showcases practical skills in data preprocessing, exploratory analysis, machine learning logic, and database integration.

By implementing a regression-based crime prediction model without external ML libraries, the project highlights strong fundamentals in algorithm design and real-world problem solving. The workflow is simple, interpretable, and efficient, making it suitable for academic submissions, interviews, and portfolio demonstrations.

Overall, this project reflects:
- Clear understanding of data-driven decision making  
- Ability to design end-to-end machine learning pipelines  
- Strong Java programming and SQL handling skills  
- Capability to convert real-world problems into working software solutions  



