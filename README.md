
# Phpstorm Laravel Snippets
* [Blade](#blade)
* [Cache](#cache)
*  [Form](#form)
 *  [Helpers](#helpers)


## Blade
|Prefix|description|
|--------|-----------|
|@elseif| Blade @elseif|
|@extends | Blade @extends
|@for | CI - Calendar Helper|
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
