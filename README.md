
# Phpstorm Laravel Snippets
* [Blade](#blade)
* [Cache](#cache)
*  [Cookie](#cookie)
*  [Form](#form)
 *  [Helpers](#helpers)
 *  [İnput](#input)
 *  [Table](#table)
 *  [Schema](#schema)


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
--------------------------------------------------------------------------------
## Cookie
|Prefix|description|
|--------|-----------|
|Cookie::forever| Make a Permanent Cookie|
|Cookie::get| Retrieve a Cookie value
|Cookie::make| Make/Queue a Cookie|
--------------------------------------------------------------------------------

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
--------------------------------------------------------------------------------

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
--------------------------------------------------------------------------------

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
--------------------------------------------------------------------------------

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
-----------------------------------------------------------------------


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
--------------------------------------------------------------------------------

## Schema
|Prefix|description|
|--------|-----------|
|Schema::connection|Specify connection for schema operation|
|Schema::create|Create new table|
Schema::hasColumn|Check for existence of column(s)
|Schema::hasTable|Check for existence of table|
Schema::rename|Rename an existing database table|
Schema::table|Update an existing table|
--------------------------------------------------------------------------------
