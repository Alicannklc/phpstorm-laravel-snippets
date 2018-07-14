
# Phpstorm Laravel Snippets
* [Auth](#auth)
*  [Blade](#blade)
* [Cache](#cache)
*  [Column](#column)
* [Cookie](#cookie)
* [Config](#config)
*  [Console](#console)
*  [Crypt](#crypt)
*  [DB](#db)
* [Event](#event)
* [Eloquent](#eloquent)
* [Hash](#hash)
*  [Form](#form)
 *  [Helpers](#helpers)
 *  [İnput](#İnput)
 *   [Log](#log)
 * [Mail](#mail)
 *  [Table](#table)
 *  [Schema](#schema)
 * [Session](#session)
 *  [Storage](#storage)
 * [Redirect](#redirect)
 * [Response](#response)
 * [Relation](#relation)
 * [Route](#route)
 * [View](#view)
 * [Validator](#validator)

## Auth
|Prefix|description|
|--------|-----------|
|Auth::attempt| The attempt method will return true if authentication was successful.|
|Auth::check |Determine if the current user is authenticated.
|Auth::guard | Auth::guard|
|Auth::guest| Determine if the current user is a guest.
|Auth::loginUsingId| To log a user into the application by their ID
|Auth::logout | Log the user out of the application.
|Auth::user | Get the currently authenticated user.|
|Auth::viaRemember|Determine if the user was authenticated using the remember me cookie.|

## Blade
|Prefix|description|
|--------|-----------|
|@elseif| Blade @elseif|
|@extends | Blade @extends
|@for | Blade @for|
|@foreach| Blade @foreach.
|@forelse| Blade @forelse
|@if | Blade @if
|@ifelse | Blade @ifelse|
|@include|Blade @include|
|@layout| Blade template skeleton|
|@section| Blade @section|
|@sectionx| Blade @section extended|
|@unless| Blade @unless|
|@while| Blade @while|
|@yield| Blade @yield|
|{!!| Blade {!! echo raw data !!}|
|{{| Blade {{ echo data }}|
|{{--| Blade comments|
|{{{| Blade {{{ echo escaped data }}}|


## Cookie
|Prefix|description|
|--------|-----------|
|Cookie::forever| Make a Permanent Cookie|
|Cookie::get| Retrieve a Cookie value
|Cookie::make| Make/Queue a Cookie|


## Config
|Prefix|description|
|--------|-----------|
|Config::all| Get all of the configuration items for the application.|
|Config::get| Get the specified configuration value.
|Config::has| Determine if the given configuration value exists.|
|Config::set| Set a given configuration value.|
|Config::setMany| Set a given configuration value|


## Config
|Prefix|description|
|--------|-----------|
|Console::anticipate|Give the user options for repsonse.|
|Console::ask|Prompts the user with a question in the console.
|Console::choice| Give the user a predefined set of choices.|
|Console::comment|Log a comment to the console.|
|Console::error| Log error to the console in red.|
|Console::info| Log information to the console in green|
|Console::option|Get an option from constructor.|
|Console::question| Logs a question to the console.|
|Console::secret|Prompt the user for hidden input.|
|Console::table| Prints a nicely formatted table to the console.|
|Console::warn|Logs a warn message to the console.|


## Crypt
|Prefix|description|
|--------|-----------|
|Crypt::decrypt|Decrypt a value|
|Crypt::encrypt|Encrypt a value.|



## Column
|Prefix|description|
|--------|-----------|
|Column::bigIncrements|Incrementing ID using a \"big integer\" equivalent.|
|Column::bigInteger| BIGINT equivalent to the table
|Column::binary|BLOB equivalent to the table|
|Column::boolean| BOOLEAN equivalent to the table|
|Column::char| CHAR equivalent with a length (optional)|
|Column::date| DATE equivalent to the table|
|Column::dateTime| DATETIME equivalent to the table|
|Column::decimal| DECIMAL equivalent with a precision and scale|
|Column::double| DOUBLE equivalent with precision|
|Column::dropColumn|Drop a column|
|Column::dropForeign|Drop a Foreign Key|
|Column::dropIndex|Drop a basic Index|
|Column::dropPrimary|Drop a Primary key|
|Column::dropUnique|Drop a Unique Index|
|Column::enum| ENUM equivalent to the table|
|Column::float| FLOAT equivalent to the table|
|Column::increments|Incrementing ID|
|Column::index| Adding a basic index|
|Column::index-foreign|Add a Foreign Key to a table|
|Column::index-primary|Add a primary or array of composite keys|
|Column::index-unique|Add a unique index|
|Column::integer| INTEGER equivalent to the table|
|Column::jsonb| JSON equivalent to the table|
|Column::longText|LONGTEXT equivalent to the table|
|Column::mediumText|MEDIUMTEXT equivalent to the table|
|Column::morphs|Adds INTEGER taggable_id and STRING taggable_type|
|Column::rememberToken| Adds remember_token as VARCHAR(100) NULL|
|Column::renameColumn|Rename a column|
|Column::smallInteger|SMALLINT equivalent to the table|
|Column::softDeletes|Adds deleted_at column for soft deletes|
|Column::string| VARCHAR equivalent with a length (optional)|
|Column::text| TEXT equivalent to the table|
|Column::time| TIME equivalent to the table|
|Column::timestamp| TIMESTAMP equivalent to the table|
|Column::timestamps| Adds created_at and updated_at columns|
|Column::tinyInteger|TINYINT equivalent to the table|
|Column::uuid| UUID equivalent to the tabl|


## Cache
|Prefix|description|
|--------|-----------|
|Cache::add| Store an item in the Cache if it doesn't exist (key, value, minutes)
|Cache::decrement| Decrement a Cached value
|Cache::forever | Store an item in the Cache Permanently
|Cache::forget  | Remove an Item from the Cache
|Cache::get| Retrieve an Item from the Cache
|Cache::has  | Check for existence in Cache
|Cache::increment| Increment a Cached value.
|Cache::put |Blade @include|
|Cache::remember| Retrieve item or Store a default value if it doesn't exist|
|Cache::rememberForever| Retrieve item or Store a default value permanently


## DB
|Prefix|description|
|--------|-----------|
|DB::delete| Run an delete statement against the database.
|DB::insert| Run an insert statement against the database.
|DB::select | Run a select statement against the database.
|DB::transaction | Execute a Closure within a transaction.
|DB::transaction_begin| Start a new database transaction.
|DB::transaction_commit| Commit the active database transaction.
|DB::transaction_rollback|Rollback the active database transaction.
|DB::update|Run an update statement against the database.|

## Eloquent
|Prefix|description|
|--------|-----------|
|Eloquent::reguard()| Renables any ability to throw mass assignment exceptions.
|Eloquent::unguard()| Disables mass assignment exceptions from being thrown from model inserts and updates.|

## Event
|Prefix|description|
|--------|-----------|
|Event::createClassListener| Create a class based listener using the IoC container.
|Event::fire| Fire an event and call the listeners.|
|Event::firing| Get the event that is currently firing.|
|Event::flush|Flush a set of pushed events.|
|Event::forget| Remove a set of listeners from the dispatcher.|
|Event::getListeners| Get all of the listeners for a given event name.|
|Event::hasListeners|Determine if a given event has listeners.|
|Event::listen|Register an event listener with the dispatcher.|
|Event::makeListener| Register an event listener with the dispatcher.|
|Event::push| Register an event and payload to be fired later.|
|Event::subscribe| Register an event subscriber with the dispatcher.|
|Event::until|Check the given plain value against a hash.|

## Hash
|Prefix|description|
|--------|-----------|
|Hash::make| Hash the given value..
|Hash::needsRehash| Check if the given hash has been hashed using the given options.|

## Form
|Prefix|description|
|--------|-----------|
|Form::checkbox| Generate a Checkbox element (name, value, checked, attributes)|
|Form::email| Generate an Email Input element (name, default, attributes)
|Form::hidden | Generate a Hidden Input element (name, default)|
|Form::input|Generate a File Input element (name, attributes).
|Form::label| Generate a Label element
|Form::macro| Generate a Form Macro
|Form::model| Open a Form with Model Binding|
|Form::open|Open a Form|
|Form::openWithFileUpload| Open a Form and Enable File Upload|
|Form::password| Generate a Password Input element (name, attributes)|
|Form::radio|Generate a Radio element (name, value, checked, attributes)|
|Form::select| Generate a Drop-down list (name, array of options, default, attributes)|
|Form::selectMonth|Generate a Drop-down list with Months (name, default, attributes)|
|Form::selectRange| Generate a Drop-down list with Range (name, from, to, default, attributes)|
|Form::submit|Generate a Submit button (value, attributes)}|
|Form::text| Generate a Text Input element (name, default, attributes)|
|Form::textarea|Generate a Textarea Input element (name, default, attributes)|


## Helpers
|Prefix|description|
|--------|-----------|
|Helper::action|Generate a URL for a given controller action|
|Helper::asset|Generate a URL for an asset
|Form::hidden | Generate a Hidden Input element (name, default)|
|Helper::link_to|Generate a HTML link to the given URL.
|Helper::link_to_action| Generate a HTML link to the given controller action
|Helper::link_to_asset| Generate a HTML link to the given asset
|Helper::link_to_route| Generate a HTML link to the given route|
|Helper::path|Paths to directories|
|Helper::route| Generate a URL for a given named route|
|Helper::secure_asset| Generate a HTML link to the given asset using HTTPS|
|Helper::secure_url|Generate a fully qualified URL to a given path using HTTPS|
|Helper::url| Generate a fully qualified URL to a given path|


## İnput
|Prefix|description|
|--------|-----------|
|Input::all| Retrieve all Inputs|
|Input::except| Retrieve only some of the Request Input
|Input::fileMove| Move an Uploaded File|
|Input::fileProperty| Get Property of Uploaded File|
|Input::flash| Flash Input to the Session|
|Input::flashExcept| Flash only some Input to the Session|
|Input::flashOnly| Flash only some Input to the Session|
|Input::get::file| Retrieve an Input value|
|Input::getWithDefault| Retrieve an Input value with Default|
|Input::has| Determine if Input Value is Present|
|Input::hasFile|Determine if File was Uploadede|
|Input::old| Retrieve Old Data|
|Input::oldWithDefault|Retrieve Old Data with Default|
|Input::only|Retrieve only some of the Request Input|


## Log
|Prefix|description|
|--------|-----------|
|Log::alert| Log an alert message to the logs.|
|Log::critical|Log a critical message to the logs|
|Log::debug|Log a debug message to the logs.|
|Log::emergency|Log an emergency message to the logs.|
|Log::error|Log an error message to the logs.|
|Log::info|Log an informational message to the logs.|
|Log::log|Log a message to the logs.|
|Log::notice|Log a notice to the logs|
|Log::useDailyFiles|Register a daily file log handler.|
|Log::useFiles|Register a file log handler.|
|Log::warning| Log a warning message to the logs.|


## Mail
|Prefix|description|
|--------|-----------|
|Mail::later| Queue a new e-mail message for sending after (n) seconds.|
|Mail::laterOn| Queue a new e-mail message for sending after (n) seconds on the given queue.|
|Mail::plain|Send a new message when only a plain part.|
|Mail::queue| Queue a new e-mail message for sending.|
|Mail::queueOn| Queue a new e-mail message for sending on the given queue.|
|Mail::raw| Send a new message when only a raw text part.|


## Redirect
|Prefix|description|
|--------|-----------|
|Redirect::to|Redirect to URL, Route or Controller|
|Redirect::withErrors|Redirect to URL, Route or Controller with Errors|
|Redirect::withFlashData|Redirect to URL, Route or Controller with Flash Data|
|Redirect::withInput|Redirect to URL, Route or Controller with Input|
|Redirect::withInputAndErrors|Redirect with Inputs and Errors|


## Response
|Prefix|description|
|--------|-----------|
|Response::download|Create a File Download Response|
|Response::json|Create a JSON Response|
|Response::JSONP|Create a JSONP Response|
|Response::macro|Create a Response Macro|
|Response::make|Create a Custom Response|


## Relation
|Prefix|description|
|--------|-----------|
|Relation::belongsTo|A one-to-one inverse relationship.|
|Relation::belongsToMany|A many-to-many relationship.|
|Relation::hasMany|A one-to-many relationship.|
|Relation::hasManyThrough|A Has Many Through relationship.|
|Relation::hasOne|A one-to-one relationship.|



## Route
|Prefix|description|
|--------|-----------|
@getWhere|Annotation - Basic Route with Constraints|
|@hears|Annotation - Event|
@middleware|Annotation - Middleware
|@resource|Annotation - Resource|
@where|Annotation - Route Constraints|
Route::controller|Route to a RESTful Controller|
Route::filter|Define A Route Filter|
Route::get|Basic Route with Closure (get, post, any)|
Route::post|Basic Post Route.|
Route::delete|Basic Delete Route.|
Route::getController|Route to Controller Action
Route::getNamedRoute|Create Named Route|
Route::getWithFilters|Attaching Filter(s) to a route|
Route::getWithParam|Route parameters with defaults|
Route::group|Create a Group of Routes|
Route::https |Force a Route to be served over HTTPS|
Route::match|Registering A Route For Multiple Verbs|
Route::pattern|Define Global Patterns (Regex)|
Route::when|Pattern based filters on routes|


## Schema
|Prefix|description|
|--------|-----------|
|Schema::connection|Specify connection for schema operation|
|Schema::create|Create new table|
Schema::hasColumn|Check for existence of column(s)
|Schema::hasTable|Check for existence of table|
Schema::rename|Rename an existing database table|
Schema::table|Update an existing table|


## Session
|Prefix|description|
|--------|-----------|
Session::all|Retrieve All Data from the Session|
|Session::flash|Flash an Item in the Session|
Session::flush|Remove All Items from the Session
|Session::forget|Remove an Item from the Session|
Session::get|Retrieve an Item from the Session or Default Value|
Session::has|Determin if an Item Exists in the Session|
Session::has|Determin if an Item Exists in the Session|
Session::keep|Reflash Only a Subset of Flash Data|
Session::push|Push a Value onto an Array Session Value
Session::put|Store an Item in the Session|
Session::reflash|Reflash the Current Flash Data|
Session::regenerate|Regenerate the Session ID|


## Storage
|Prefix|description|
|--------|-----------|
Storage::allDirectories|Returns an array of all the directories within a given directory and all of its sub-directories|
|Storage::allFiles|Get all of the files from the given directory (recursive)|
Storage::append|Insert content at the end of a file.
|Storage::cleanDirectory|Empty the specified directory of all files and folders.|
Storage::copy|Copy an existing file to another location on the disk|
Storage::delete|Remove one or multiple files from the disk|
Storage::deleteDirectory|May be used to remove a directory, including all of its files, from the disk|
Storage::directories|Returns an array of all the directories within a given directory|
|Storage::exists|Determine if a file exists|
Storage::extension|Extract the file extension from a file path.|
Storage::files|Returns an array of all of the files in a directory|
Storage::get|Retrieve the contents of a given file|
Storage::isDirectory|Determine if the given path is a directory.|
Storage::isFile|Determine if the given path is a directory.|
Storage::iswritable|Determine if the given path is writable.|
Storage::lastModified|Returns the UNIX timestamp of the last time the file was modified|
Storage::makeDirectory|Will create the given directory, including any needed sub-directories|
Storage::mimeType|Get the mime-type of a given file.|
Storage::move|Move an existing file to a new location on the disk|
Storage::name|Extract the file name from a file path.|
Storage::prepend|Insert content at the beginning of a file|
Storage::put|Store a file on disk|
Storage::size|Get the size of the file in bytes|
Storage::type|Get the file type of a given file.|



## Table
|Prefix|description|
|--------|-----------|
|$table->bigInteger|BIGINT equivalent to the table.|
|$table->binary | BLOB equivalent to the table
|$table->boolean | BOOLEAN equivalent to the table|
|$table->date| DATE equivalent to the table.
|$table->dateTime| DATETIME equivalent to the table
|$table->decimal('amount', 5, 2);|DECIMAL equivalent with a precision and scale|
|$table->double('column', 15, 8); |DOUBLE equivalent with precision|
|$table->dropColumn| Drop a column|
|$table->dropForeign| Drop a Foreign Key|
|$table->dropIndex|Drop a basic Index|
|$table->dropUnique|Drop a Unique Index|
|$table->engine| Set the storage engine for a table|
|$table->enum|ENUM equivalent to the table|
|$table->float|FLOAT equivalent to the table|
|$table->foreign| Add a Foreign Key to a table|
|$table->increments|Incrementing ID|
|$table->integer|INTEGER equivalent to the table|
|$table->longText|LONGTEXT equivalent to the table|
|$table->mediumText|MEDIUMTEXT equivalent to the table|
|$table->morphs|Adds INTEGER taggable_id and STRING taggable_type|
|$table->primary|Add a primary or array of composite keys|
|$table->renameColumn|Rename a column|
|$table->smallInteger|SMALLINT equivalent to the table|
|$$table->softDeletes|Adds deleted_at column for soft deletes|
|$table->string|VARCHAR equivalent with a length (optional)|
|$table->text|TEXT equivalent to the table|
|$table->time|TIME equivalent to the table|
|$table->timestamp|TIMESTAMP equivalent to the table|
|$table->timestamps|Adds created_at and updated_at columns|
$table->tinyInteger|TINYINT equivalent to the table|
$table->unique|Add a unique index|
unsigned|Add Set INTEGER to UNSIGNED|
$table->bigIncrements|Incrementing ID using a "big integer" equivalent.|
after|Add Column AFTER|
|default|Declare a default value for a column|
nullable|Designate that the column allows NULL values|


## View
|Prefix|description|
|--------|-----------|
|View::composer|Define a View Composer|
|View::composerClass|Define a Class-based View Composer|
|View::creator|Register a View Creator|
|View::make|Create a View with Data|
|View::makeCompact|Create a View, Pass Data with compact()|
|View::makeWith|Create a View, Pass Data using with()|
|View::share|Share Data across all Views|



## Validator
|Prefix|description|
|--------|-----------|
|Validator::extend|Register a custom validator extension.|
|Validator::make|Create a new Validator instance.|
|Validator::resolver|Resolve a new Validator instance.|
