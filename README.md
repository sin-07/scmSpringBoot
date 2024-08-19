# scm

<h1>How to Include tailwindCSS</h1>

if you need tailwindCSS in any pages
step1 :-

Install tailwindcss via npm, and create your tailwind.config.js file.

npm install -D tailwindcss
npx tailwindcss init

step2 :-

Add the paths to all of your template files in your tailwind.config.js file.

/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/**/*.{html,js}"],
  theme: {
    extend: {},
  },
  plugins: [],
}

step3 :-

Add the @tailwind directives for each of Tailwind’s layers to your main CSS file.

@tailwind base;
@tailwind components;
@tailwind utilities;

step4 :-

Run the CLI tool to scan your template files for classes and build your CSS.

npx tailwindcss -i ./src/input.css -o ./src/output.css --watch